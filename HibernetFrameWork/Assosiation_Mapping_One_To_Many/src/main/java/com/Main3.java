package com;

import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.dto.Category;
import com.dto.Item;

public class Main3 {
	public static void main(String[] args) throws HibernateException {
		Configuration cfg = new Configuration().configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();

		Query q = s.createQuery("from Category");
		List<Category> c = q.list();
		for (Category ca : c) {
			System.out.println(ca);
			Set<Item> items = ca.getItems();
			for (Item i : items) {
				System.out.println(i);

			}
		}


		tr.commit();
		s.close();
		sf.close();
		
		

	}
}
