package dto;

import org.hibernate.cfg.Configuration;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main2 {
	public static void main(String[] args) {		
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		
		StandardServiceRegistry ssr = ssrb.build();
		
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
	Student std = new Student(101, "shiva", 7878.50f);	
	s.save(std);
		
		tr.commit();
		s.close();
		sf.close();
		
		
	}
}
