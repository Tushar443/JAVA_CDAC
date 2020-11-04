package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.comp.AccountDao;



public class Main {
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("cfg.xml");
		AccountDao ac = (AccountDao)a.getBean(AccountDao.class);
		ac.createAcc();
	
	}

}
