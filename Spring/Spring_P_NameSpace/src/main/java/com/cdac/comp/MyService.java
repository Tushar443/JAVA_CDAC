package com.cdac.comp;

public class MyService {
	private int ServiceNo;
	private MyDao myDao;

	public MyService() {
		System.out.println("Myservice Cons");
	}

	public int getServiceNo() {
		return ServiceNo;
	}

	public void setServiceNo(int serviceNo) {
		ServiceNo = serviceNo;
	}

	public MyDao getMyDao() {
		return myDao;
	}

	public void setMyDao(MyDao myDao) {
		this.myDao = myDao;
	}
	public void add() {
		System.out.println("Add method of Service");
		myDao.insert();
	}
	
}
