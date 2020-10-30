package com.cdac.comp;

public class MyService {
	private int serviceID;
	public int getServiceID() {
		return serviceID;
	}

	public void setServiceID(int serviceID) {
		this.serviceID = serviceID;
	}
	private MyDao myDao;

	public MyService() {
		System.out.println("Myservice Cons");
	}

	public MyDao getMyDao() {
		return myDao;
	}

	public MyService(int serviceID ,MyDao myDao) {
		System.out.println("PArameterCon");
		this.myDao = myDao;
		this.serviceID=serviceID;
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
