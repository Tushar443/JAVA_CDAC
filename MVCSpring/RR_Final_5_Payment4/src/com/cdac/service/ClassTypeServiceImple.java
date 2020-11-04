package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.IClassType;

@Service
public class ClassTypeServiceImple implements IClassTypeService {
	@Autowired
	private IClassType classType;

	@Override
	public double findPrice(String className, int trainId) {
		return classType.getPriceofClass(className, trainId);
	}

}
