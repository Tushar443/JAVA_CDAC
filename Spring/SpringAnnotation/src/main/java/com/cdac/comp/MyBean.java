package com.cdac.comp;

import org.springframework.stereotype.Component;

@Component
public class MyBean {
	private int beanNo;
	private String beanMsg;

	public MyBean() {
		System.out.println("no arg");
	}

	public int getBeanNo() {
		return beanNo;
	}

	public void setBeanNo(int beanNo) {
		System.out.println("set Bean No");
		this.beanNo = beanNo;
	}

	public String getBeanMsg() {
		return beanMsg;
	}

	public void setBeanMsg(String beanMsg) {
		System.out.println("set Bean Msg");
		this.beanMsg = beanMsg;
	}

	
}
