package com.cdac.service;

import org.springframework.stereotype.Service;

@Service
public interface IClassTypeService {
	double findPrice(String className, int trainId);
}
