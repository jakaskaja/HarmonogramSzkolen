package pl.pwn.reaktor.harmonogram.service;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pl.pwn.reaktor.harmonogram.model.Login;
import pl.pwn.reaktor.harmonogram.util.HibernateUtil;

public class LoginService {

	public boolean login(String login, String password) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = session.beginTransaction();
		
		Query query = session.createQuery("FROM Login WHERE login=:login and password=:password");
		query.setString("login", login);
		query.setString("password", password);
		
		List<Login> list = query.list();
		trx.commit();
		session.close();
		
		if (list.isEmpty()) {
			return false;
		}
		Login loggedUser = list.get(0);
		System.out.println("Zalogowano jako " + loggedUser.getLogin());
		return true;
	}
}
