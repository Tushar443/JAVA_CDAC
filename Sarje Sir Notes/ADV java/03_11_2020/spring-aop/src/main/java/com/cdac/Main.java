package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.dao.AccountDao;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg.xml");
		
		AccountDao dao = (AccountDao)appCntx.getBean(AccountDao.class);
		System.out.println("=========================");
		dao.createAccount();
		System.out.println("=========================");
		dao.withdraw();
		System.out.println("=========================");
		dao.deposite();
		System.out.println("=========================");
		dao.blockAccount();
		System.out.println("=========================");
	}

}
