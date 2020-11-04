package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.comp.AccountDao;



public class Main {
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("cfg.xml");
		AccountDao ac = (AccountDao)a.getBean(AccountDao.class);
		System.out.println("@@@@@@@@@@@@@@@@");
		ac.createAcc();
		System.out.println("@@@@@@@@@@@@@@@@");
		ac.withDraw();
		System.out.println("@@@@@@@@@@@@@@@@");
		ac.deposite();
		System.out.println("@@@@@@@@@@@@@@@@");
		ac.blockAcc();
		System.out.println("@@@@@@@@@@@@@@@@");
		ac.MyAccount();
		System.out.println("@@@@@@@@@@@@@@@@");

	}

}
