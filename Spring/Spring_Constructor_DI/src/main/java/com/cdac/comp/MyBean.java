package com.cdac.comp;



public class MyBean {
	private int beanNo;
	private String beanMsg;

	public MyBean() {
		System.out.println("No arg Constructor");
	}

	
//	public MyBean(int beanNo, String beanMsg) {
//		System.out.println("con int  String ");
//		this.beanNo = beanNo;
//		this.beanMsg = beanMsg;
//	}

	public MyBean(String beanMsg,int beanNo) {
		System.out.println("con String int");
		this.beanNo = beanNo;
		this.beanMsg = beanMsg;
	}
	
	public int getBeanNo() {
		return beanNo;
	}

	public String getBeanMsg() {
		return beanMsg;
	}
}
