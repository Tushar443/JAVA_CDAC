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

public class Main4 {
	public static void main(String[] args) throws HibernateException {
		Configuration cfg = new Configuration().configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();

		Item item = new Item(6, "Fridge");


		Category c = (Category)s.get(Category.class, 10);
		c.getItems().add(item);
		s.save(item);


		tr.commit();
		s.close();
		sf.close();
		
		

	}
}
