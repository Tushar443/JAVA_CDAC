package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.comp.MyBean;

public class Main {
	public static void main(String[] args) {
		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg2.xml");
		MyBean m = (MyBean) appCntx.getBean(MyBean.class);
		m.setBeanMsg("Thudser");
		m.setBeanNo(101);
		System.out.println(m.getBeanNo());
		System.out.println(m.getBeanMsg());
	}
}
