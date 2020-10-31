package com;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.dto.Employee;

public class HBMainSelect {
	public static void main(String[] args) throws HibernateException {

		
		
		Configuration cfg = new Configuration().configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		
		ssrb.applySettings(cfg.getProperties());
		
		StandardServiceRegistry ssr = ssrb.build();
		
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		System.out.println("Get method");
//		Employee e = (Employee)s.get(Employee.class, 103);
		Employee e = (Employee)s.get(Employee.class, 113);
		System.out.println("Printing Recorde");
		System.out.println(e);
//		System.out.println(e);
		
		
		tr.commit();
		
		s.close();
		sf.close();
		
		
	}
}