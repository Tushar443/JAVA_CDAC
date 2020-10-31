package com.cdac.comp;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class AccountLog {
	
	@Pointcut("execution(* com.cdac.comp.AccountDao.createAcc(..))")
	public void accPointCut() {
		
	}
	
	@Before(value = "accPointCut()")
	public void beforeCreateAcc() {
		System.out.println("before Account");
	}

}
