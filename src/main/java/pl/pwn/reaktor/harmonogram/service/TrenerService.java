package pl.pwn.reaktor.harmonogram.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pl.pwn.reaktor.harmonogram.model.Login;
import pl.pwn.reaktor.harmonogram.model.TrenerTableRow;
import pl.pwn.reaktor.harmonogram.util.HibernateUtil;

public class TrenerService {
	
	public void fillTable(String login, String password) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = session.beginTransaction();
		
		Query query = session.createSQLQuery("select cal.date, t.akronim, cat.cat_name, u.last_name from calendar cal left join\n" + 
				"categories cat on cal.id_cat = cat.id_cat left join\n" + 
				"training t on cat.id_t = t.id_t left join\n" + 
				"training_couch tc on cal.id_cal = tc.id_cal left join\n" + 
				"user u on tc.id_user = u.id_user;");
		query.setString("login", login);
		query.setString("password", password);
		
		List<TrenerTableRow> list = query.list();
		trx.commit();
		session.close();
		
		TrenerTableRow trenerTableRow = list.get(0);
	}	
	
	
	public List<TrenerTableRow> getAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = session.beginTransaction();
		
		
		Query query = session.createSQLQuery("select calendar.date, training.akronim, categories.cat_name, user.last_name from calendar left join\n" + 
				"categories on calendar.id_cat = categories.id_cat left join\n" + 
				"training on categories.id_t = training.id_t left join\n" + 
				"training_couch on calendar.id_cal = training_couch.id_cal left join\n" + 
				"user on training_couch.id_user = user.id_user");
		List<TrenerTableRow> trenerTableRows = query.list();
		trx.commit();
		session.close();
	
		return trenerTableRows;
	}

}
