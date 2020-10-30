package com.cdac.comp;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class MyDao {
	
	
	
	public void insert() {
		System.out.println("Insert Call=====");
	}

	public MyDao() {
		System.out.println("Mydao cons");
	}
	
}
