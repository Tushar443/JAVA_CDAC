package com;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.dto.Category;
import com.dto.Item;

public class Main {
	public static void main(String[] args) throws HibernateException {
		Configuration cfg = new Configuration().configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Item item1 = new Item(3, "Fan");
		Item item2 = new Item(4, "Coller");

		Category c = new Category(20, "HOme");
		c.getItems().add(item1);
		c.getItems().add(item2);
		s.save(c);
		s.save(item1);
		s.save(item2);


		tr.commit();
		s.close();
		sf.close();
		
		

	}
}
