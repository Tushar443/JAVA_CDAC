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

public class HBMainInsert {
	public static void main(String[] args) throws HibernateException {
//		Configuration cfg = new Configuration().configure();
//		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
//		ssrb.applySettings(cfg.getProperties());
//		StandardServiceRegistry ssr = ssrb.build();
//		SessionFactory sf = cfg.buildSessionFactory(ssr);
//		Session s = sf.openSession();
//		Transaction tr = s.beginTransaction();
//		Employee e = new Employee(101, "ram", 99999.50f, "cs", new Date());
//		s.save(e);
//		tr.commit();
//		s.close();
//		sf.close();
		
		
		Configuration cfg = new Configuration().configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		
		ssrb.applySettings(cfg.getProperties());
		
		StandardServiceRegistry ssr = ssrb.build();
		
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		Employee e = new Employee(102, "Thunder", 234.223f, "EXTC", new Date());
		
		s.save(e);
		
		tr.commit();
		
		s.close();
		sf.close();
		
		
	}
}
