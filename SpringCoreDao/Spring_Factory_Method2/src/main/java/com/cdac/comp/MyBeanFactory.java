package com.cdac.comp;

public class MyBeanFactory {
	public static MyBean getInstance() {
		MyBean m =new MyBean();
		m.setBeanMsg("Tushar");
		return m;
	}
}
