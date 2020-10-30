package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.comp.MyService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("cfg.xml");
//		System.out.println("====");
		MyService ms = (MyService) a.getBean("serv");
//		System.out.println("++++++++++");
		ms.add();
	}

}
