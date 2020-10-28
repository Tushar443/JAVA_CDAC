
package com.cdac.comp;

public class MyService {
	private MyDao myDao;

	public MyService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyDao getMyDao() {
		return myDao;
	}

	public void setMyDao(MyDao myDao) {
		this.myDao = myDao;
	}

	public MyService(MyDao myDao) {
		super();
		this.myDao = myDao;
	}
	public void add() {
		myDao.insert();
	}
	
}
