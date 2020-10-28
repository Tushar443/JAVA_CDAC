package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.comp.MyDao;
import com.cdac.comp.MyService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("cfg.xml");
		System.out.println("getBean() call"  );
//		MyDao m = (MyDao)a.getBean("myDao");
		//MyService m = (MyService)a.getBean("myDao");
		
		
		MyService m = (MyService)a.getBean(MyService.class);
		
		System.out.println(m);
	}
}
