package com;

import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
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

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("##################\n" + "0 to Exit \n" + "1 to Select all \n"
					+ "2 to Select Order by Employee Name\n" + "3 to Select Employee by Where\n" + "4 to And OR");
			byte choice = sc.nextByte();
			switch (choice) {
			case 0:
				flag = false;
				break;
			case 1:
				selectAll();
				break;
			case 2:
				selectOrderBy();
				break;
			case 3:
				selectWhere();
				break;
			case 4:
				selectAND();
				break;
			}

		}
		sf.close();
	}

	public static void selectAll() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		SQLQuery s1 = s.createSQLQuery("select * from EMP");
		s1.addEntity(Employee.class);
		List<Employee> li = s1.list();

		for (Employee employee : li) {
			System.out.println(employee);
		}

		tr.commit();

		s.close();
	}

	public static void selectOrderBy() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		SQLQuery s1 = s.createSQLQuery("select emp_id from EMP order by emp_id");
		List<Integer> li = s1.list();

		for (Integer employee : li) {
			System.out.println(employee);
		}

		tr.commit();

		s.close();
	}

	public static void selectWhere() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();

		SQLQuery q = s.createSQLQuery("select * from EMP where dept =?");
		q.setString(0, "ITTTT");
		List<Object[]> li = q.list();

		for (Object[] employee : li) {
			System.out.println(employee[0] + " " + employee[1]);
		}

		tr.commit();

		s.close();
	}

	public static void selectAND() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();

		SQLQuery q = s.createSQLQuery("select * from EMP where dept =? and basic_salary >=?");
		q.setString(0, "CS");
		q.setFloat(1, 23f);
		List<Object[]> li = q.list();
				
		for (Object[] employee : li) {
					System.out.println(employee[0] + " " + employee[1] + " " + employee[2] + " " + employee[3] + " "
							+ employee[4]);
				}
		tr.commit();
		
		s.close();
	}

}
