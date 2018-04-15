package pl.pwn.reaktor.harmonogram.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pl.pwn.reaktor.harmonogram.model.Training;
import pl.pwn.reaktor.harmonogram.util.HibernateUtil;



public class TrainingService {

	public int save (Training training) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		int id = (int) session.save(training);
		transaction.commit();
		session.close();
		return id;
	}
}
