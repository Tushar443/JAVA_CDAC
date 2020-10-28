
package com.cdac.comp;

public class MyService {
	private MyDao myDao;

	public MyService() {
	}

	public MyService(MyDao myDao) {
		System.out.println("Parameterized MyService");
		this.myDao = myDao;
	}

	public MyDao getMyDao() {
		return myDao;
	}
	public void add() {
		System.out.println("Add method");
		myDao.insert();
	}
	
}
