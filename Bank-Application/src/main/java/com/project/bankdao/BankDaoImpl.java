package com.project.bankdao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.bankentity.Bank;

public class BankDaoImpl implements BankDao {
	@Autowired
	private SessionFactory sessionFactory;
	public BankDaoImpl() {
		System.out.println("object is created:"+this.getClass().getName());
	}

	@Override
	public boolean saveBankDetails(Bank bank) {
		System.out.println("Involked saveBankDetails()");
		Session session=null;
		
		try {
			session=sessionFactory.openSession();
			session.beginTransaction();
			session.save(bank);
			session.getTransaction().commit();
			System.out.println("Data is saved succesfully");
			return true;
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		finally {
			if(session!=null) {
				session.close();
				System.out.println("session is closed.......");
			}
			else {
				System.out.println("session is not closed....");
			}
		}
		
		return false;
	}

}
