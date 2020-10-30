package com.cdac.comp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyCall {
	private List<String> myList;
	private Set<String> mySet;
	private Map<String, Object> myMap;
	private Properties properties;
	private String[ ] arr;
	public MyCall() {
	}
	
	
	public MyCall(List<String> myList, Set<String> mySet, Map<String, Object> myMap, Properties properties,
			String[] arr) {
		System.out.println("Constructor");
		this.myList = myList;
		this.mySet = mySet;
		this.myMap = myMap;
		this.properties = properties;
		this.arr = arr;
	}


	public List<String> getMyList() {
		return myList;
	}
	
	public Set<String> getMySet() {
		return mySet;
	}
	
	public Map<String, Object> getMyMap() {
		return myMap;
	}

	public Properties getProperties() {
		return properties;
	}

	public String[] getArr() {
		return arr;
	}
	
}
