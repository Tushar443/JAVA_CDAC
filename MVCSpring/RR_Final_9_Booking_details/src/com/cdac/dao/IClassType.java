package com.cdac.dao;

public interface IClassType {
	double getPriceofClass(String className, int trainId);

	boolean updateFair(String className, int trainId, double price);

}
