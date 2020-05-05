package com.javabykiran.logger;

import java.sql.Date;
import java.util.logging.Logger;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {
Logger logger1=Logger.getLogger(getClass().getName());
	public LogginAspect() {
		// TODO Auto-generated constructor stub
		System.out.println("login aspect");
	}
	
/*@Before("execution(* com.javabykiran...checkLogin(*))")
	public void logServicemetodsAft1(JoinPoint joinpoint) {
		System.out.println( joinpoint.getSignature().getName());
		System.out.println("joint");
		
}*/

	@Pointcut(value="execution(* com.javabykiran.controller.*.*(..))")
	private void getcontroller()   
	{   
	} 

	@Pointcut(value="execution(* com.javabykiran.service.*.*(..))")
	private void getservice()   
	{ 
		
	} 
	

	@Pointcut(value="execution(* com.javabykiran.dao.*.*(..))")
	private void getdao()   
	{ 
		
	}
	
	@Around("getcontroller()||getservice()||getdao()")
public Object aroundAdvice(ProceedingJoinPoint jp) throws Throwable   {
		
		String method=jp.getSignature().getName();
		
		long start=System.currentTimeMillis();
		
		Date date=new Date(start);
		
		logger1.info("start calling "+method+"at"+date+".");
		
		Object rs=null;
		
	  
	try   
	{  
	rs=jp.proceed();  
	}   
	catch (Exception e) {
		e.printStackTrace();
	}
        return rs;  
	}
}
