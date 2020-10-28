package com.cdac.comp;

public class MyService {
	private MyDao myDao;

	public MyService() {
		System.out.println("Myservice Cons");
	}

	public MyDao getMyDao() {
		return myDao;
	}

	public MyService(MyDao myDao) {
		System.out.println("PArameterCon");
		this.myDao = myDao;
	}

	public void setMyDao(MyDao myDao) {
		System.out.println("Setter Called");
		this.myDao = myDao;
	}
	public void add() {
		System.out.println("Add method of Service");
		myDao.insert();
	}
	
}
