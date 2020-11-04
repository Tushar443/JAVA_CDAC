package com.cdac.comp;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
	public void AfterAcc() {
		System.out.println("After Account");
	}

	@Pointcut("execution(* com.cdac.comp.AccountDao.withDraw(..))")
	public void accPointCut1() {
		
	}
	
	@After(value = "accPointCut1()")
	public void AfterWithdraw() {
		System.out.println("After Account");
	}
	
	@Pointcut("execution(* com.cdac.comp.AccountDao.deposite(..))")
	public void accPointCut2() {
		
	}
	
	@Around(value = "accPointCut2()")
	public void aroundDeposite(ProceedingJoinPoint pjp) {
		System.out.println("before Deposite");
		try {
			pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("After Deposite");
	}
	
	
	@Pointcut("execution(* com.cdac.comp.AccountDao.blockAcc(..))")
	public void accPointCut3() {
		
	}
	
	@AfterThrowing(value = "accPointCut3()")
	public void afterException() {
		System.out.println("before Exception");
//		System.out.println("After Exception");
	}
	
	
	@Pointcut("execution(* com.cdac.comp.AccountDao.MyAccount(..))")
	public void accPointCut4() {
		
	}
	
	@AfterReturning(value = "accPointCut4()")
	public void afterReturning() {
		System.out.println("After Returnig");
	}
}
