package com;

import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.dto.Employee;

public class HB_HQL_Main {
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
					+ "1 to Select all \n"
					+ "2 to Select Order by Employee Name\n"
					+ "3 to Select Employee by Where\n"
					+ "4 to And OR");
			byte choice =sc.nextByte();
			switch(choice) {
			case 0:
					flag = false;
					break;
			case 1 :
					selectAll();
					break;
			case 2 : 
					selectOrderBy();
					break;
			case 3 : 
					selectWhere();
					break;
			case 4 : 
					selectAND();
					break;
			}
			
		}	
		sf.close();
	}
	
	public static void selectAll() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
//		Query q = s.getNamedQuery("selectAll");
		Query q = s.getNamedQuery("selAll");
		List<Employee> li = q.list();
		
		for (Employee employee : li) {
			System.out.println(employee);
		}
		
		tr.commit();
		
		s.close();
	}
	
	public static void selectOrderBy() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Query q = s.createQuery("from Employee order by empName");
		List<Employee> li = q.list();
		
		for (Employee employee : li) {
			System.out.println(employee);
		}
		
		tr.commit();
		
		s.close();
	}
	
	public static void selectWhere() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Query q = s.createQuery("from Employee where dept = ?");
		q.setString(0, "ITTTT");
		List<Employee> li = q.list();
		
		for (Employee employee : li) {
			System.out.println(employee);
		}
		
		tr.commit();
		
		s.close();
	}
	
	public static void selectAND() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Query q = s.createQuery("from Employee where dept = ? and basicSalary >=?");
		q.setString(0, "ITTTT");
		q.setFloat(1, 120000f);
		List<Employee> li = q.list();
		
		for (Employee employee : li) {
			System.out.println(employee);
		}
		
		tr.commit();
		
		s.close();
	}
	
}
