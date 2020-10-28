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
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MyCall [myList=" + myList + ", mySet=" + mySet + ", myMap=" + myMap + ", properties=" + properties
				+ ", arr=" + Arrays.toString(arr) + "]";
	}
	public List<String> getMyList() {
		return myList;
	}
	public void setMyList(List<String> myList) {
		this.myList = myList;
	}
	public Set<String> getMySet() {
		return mySet;
	}
	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}
	public Map<String, Object> getMyMap() {
		return myMap;
	}
	public void setMyMap(Map<String, Object> myMap) {
		this.myMap = myMap;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public String[] getArr() {
		return arr;
	}
	public void setArr(String[] arr) {
		this.arr = arr;
	}
	public MyCall(List<String> myList, Set<String> mySet, Map<String, Object> myMap, Properties properties,
			String[] arr) {
		super();
		this.myList = myList;
		this.mySet = mySet;
		this.myMap = myMap;
		this.properties = properties;
		this.arr = arr;
	}
	
	

}
