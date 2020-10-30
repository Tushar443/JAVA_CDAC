package com.cdac.comp;

public class MyService {
	private MyDao myDao;

	public MyService() {
		System.out.println("Myservice Cons");
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
