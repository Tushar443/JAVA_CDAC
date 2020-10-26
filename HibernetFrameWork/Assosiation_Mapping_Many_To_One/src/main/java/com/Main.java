package com;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.dto.Department;
import com.dto.Employee;

public class Main {
	public static void main(String[] args) throws HibernateException {
		Configuration cfg = new Configuration().configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();

		Department d = new Department(10, "cs");
		Employee e1 = new Employee(102, "Tusahr");
		e1.setDept(d);
		s.save(d);
		s.save(e1);

		tr.commit();
		s.close();
		sf.close();
		
		

	}
}
