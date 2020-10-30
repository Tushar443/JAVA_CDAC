package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.comp.Rectangular;

public class Main {
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("cfg.xml");
		Rectangular r = (Rectangular) a.getBean("rect1");
		Rectangular r1 = (Rectangular) a.getBean("rect");
		System.out.println(r.getArea());
		System.out.println(r.getBreath());
		System.out.println(r.getLength());
		
		System.out.println("@@@@@@@@@@@@@@@@@@@");
		
		System.out.println(r1.getArea());
		System.out.println(r1.getBreath());
		System.out.println(r1.getLength());
	}

}
