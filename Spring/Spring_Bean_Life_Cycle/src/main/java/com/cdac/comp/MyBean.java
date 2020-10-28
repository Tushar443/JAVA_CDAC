package com.cdac.comp;



public class MyBean {
	private int beanNo;
	private String beanMsg;

	public MyBean() {
		System.out.println("zero con");
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
	
	public void start() {
		System.out.println("Start called");
	}
	public void stop() {
		System.out.println("Stop called");
	}
	
}
