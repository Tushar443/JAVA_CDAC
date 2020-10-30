package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.comp.MyCall;

public class Main {
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("cfg.xml");
		MyCall m = (MyCall) a.getBean("myCall");
		
		
		System.out.println(m.getMyList());
		System.out.println("==================@@@@@@@@@@@@@@@@");
		System.out.println(m.getMyMap());
		System.out.println("==================@@@@@@@@@@@@@@@@");
		System.out.println(m.getMySet());
		System.out.println("==================@@@@@@@@@@@@@@@@");
		System.out.println(m.getProperties());
		System.out.println("==================@@@@@@@@@@@@@@@@");
		for (String s : m.getArr()) {
			System.out.println(s);
		}
		System.out.println("==================@@@@@@@@@@@@@@@@");
	}

}
