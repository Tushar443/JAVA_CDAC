package com;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

import com.dto.Employee;

public class HB_HQL_Select {
	private static SessionFactory sf;
	
	static {
		Configuration cfg = new Configuration().configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		
		ssrb.applySettings(cfg.getProperties());
		
		StandardServiceRegistry ssr = ssrb.build();
		
		sf = cfg.buildSessionFactory(ssr);
	}
	
	public static void main(String[] args) throws HibernateException {
		
		Scanner sc =new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("##################\n"
					+ "0 to Exit \n"
					+ "1 to Select by Name \n"
					+ "2 to Select Name and Salaray\n"
					+ "3 to Select distinct by dept\n"
					+ "4 to Select Like\n"
					+ "5 to sum of basicSalary\n"
					+ "6 to sum Group by\n"
					+ "7 to sub Query\n");
			byte choice =sc.nextByte();
			switch(choice) {
			case 0:
					flag = false;
					break;
			case 1 :
				selectProjection();
					break;
			case 2 : 
					selectTwoData();
					break;
			case 3 : 
					selectDistinct();
					break;
			case 4 : 
					selectLike();
					break;
			case 5: 
					selectSum();
					break;
			case 6: 
				selectSumDept();
				break;
			case 7: 
				selectSubQuery();
				break;
			}
			
		}	
		sf.close();
	}
	
	public static void selectProjection() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Criteria q  = s.createCriteria(Employee.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("empName"));
		q.setProjection(p);
		List<Object[]> li = q.list();
		
		for (Object[] name : li) {
			System.out.println(name[0]+" "+ name[11]);
		}
		
		tr.commit();
		
		s.close();
	}
	
	public static void selectTwoData() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Criteria q  = s.createCriteria(Employee.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("empName"));
		p.add(Projections.property("basicSalary"));
		
		q.setProjection(p);
		
				
		List<Object[]> li = q.list();
		
		for (Object[] e : li) {
			System.out.println(e[0]+" "+e[1]);
		}
		
		tr.commit();
		
		s.close();
	}
	
	public static void selectDistinct() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.distinct(Projections.property("empName")));
		q.setProjection(p);
		List<String> li = q.list();
		
		for (String name : li) {
			System.out.println(name);
		}
		
		tr.commit();
		
		s.close();
	}
	
	public static void selectLike() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("empName"));
		q.setProjection(p);
		q.add(Restrictions.like("empName", "t%"));
		
		
		List<String> li = q.list();
		
		for (String name : li) {
			System.out.println(name);
		}
		
		tr.commit();
		
		s.close();
	}
	
	public static void selectSum() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.sum("basicSalary"));
		q.setProjection(p);
		List<Double> li = q.list();
		
		for (Double e : li) {
			System.out.println(e);
		}
		
		tr.commit();
		
		s.close();
	}
	
	public static void selectSumDept() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		Criteria q = s.createCriteria(Employee.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.groupProperty("dept"));
		p.add(Projections.sum("basicSalary"));
		q.setProjection(p);
		
		List<Object[]> li = q.list();
		
		for (Object[] e : li) {
			System.out.println(e[0]+" "+e[1]);
		}
		
		tr.commit();
		
		s.close();
	}
	
	public static void selectSubQuery() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		DetachedCriteria dc = DetachedCriteria.forClass(Employee.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.avg("basicSalary"));
		dc.setProjection(p);
		
		Criteria q = s.createCriteria(Employee.class);
		ProjectionList pl = Projections.projectionList();
		
		pl.add(Projections.property("empName"));
		pl.add(Projections.property("basicSalary"));
		
		q.setProjection(pl);
		
		q.add(Property.forName("basicSalary").ge(dc));
		
		List<Object[]> li = q.list();
		
		for (Object[] e : li) {
			System.out.println(e[0]+" "+e[1]);
		}
		
		tr.commit();
		
		s.close();
	}
}
