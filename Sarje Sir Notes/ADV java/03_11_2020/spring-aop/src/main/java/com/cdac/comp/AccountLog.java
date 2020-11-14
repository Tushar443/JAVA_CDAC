package com.cdac.comp;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class AccountLog {
	
	@Pointcut("execution(* com.cdac.dao.AccountDao.createAccount(..))")
	public void accPointCut1() {
		
	}
	
	@Before(value = "accPointCut1()")
	public void beforeCreateAcc() {
		System.out.println("before acc create");
	}
	
	@Pointcut("execution(* com.cdac.dao.AccountDao.withdraw(..))")
	public void accPointCut2() {
		
	}
	
	@After(value = "accPointCut2()")
	public void afterWithdraw() {
		System.out.println("after acc create");
	}
	
	
	@Pointcut("execution(* com.cdac.dao.AccountDao.deposite(..))")
	public void accPointCut3() {
		
	}
	
	@Around(value = "accPointCut3()")
	public void aroundDeposite(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("before acc deposite");
		pjp.proceed();
		System.out.println("after acc deposite");
	}
	
	@Pointcut("execution(* com.cdac.dao.AccountDao.blockAccount(..))")
	public void accPointCut4() {
		
	}
	
	@AfterThrowing(value = "accPointCut4()")
	public void afterExcep() {
		System.out.println("after exception");
		
	}
	
}
