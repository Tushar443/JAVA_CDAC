package com;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

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
					selectData();
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
	
	public static void selectData() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Query q = s.createQuery("select empName from Employee");
		List<String> li = q.list();
		
		for (String name : li) {
			System.out.println(name);
		}
		
		tr.commit();
		
		s.close();
	}
	
	public static void selectTwoData() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Query q = s.createQuery("select empName,basicSalary from Employee");
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
		Query q = s.createQuery("select distinct(empName) from Employee");
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
		Query q = s.createQuery("select empName from Employee where empName like ?");
		q.setString(0, "t%");
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
		Query q = s.createQuery("select sum(basicSalary) from Employee");
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
		Query q = s.createQuery("select dept, sum(basicSalary) from Employee group by dept");
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
		Query q = s.createQuery("select empName,basicSalary from Employee where basicSalary >=(select avg(basicSalary) from Employee)");
		List<Object[]> li = q.list();
		
		for (Object[] e : li) {
			System.out.println(e[0]+" "+e[1]);
		}
		
		tr.commit();
		
		s.close();
	}
}
