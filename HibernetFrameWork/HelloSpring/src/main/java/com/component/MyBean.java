package com.component;

public class MyBean {
	private String msg;

	public MyBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public MyBean(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "MyBean [msg=" + msg + "]";
	}

}
