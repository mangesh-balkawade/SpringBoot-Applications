package com.mangesh.crud.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass {
	
	Log log=LogFactory.getLog(getClass());

	@AfterThrowing(pointcut = "execution(* com.mangesh.crud.controller.*.*(..))",throwing = "exception")
	public void log(Exception exception)
	{
		log.info("-----------------------------------------------------------");
		log.error(exception.getMessage() ,exception);
		log.info("-----------------------------------------------------------");
	}
	
	@Around("execution(* com.mangesh.crud.controller.*.*(..))")
	public void log(ProceedingJoinPoint proceed) throws Throwable
	{
		log.info("-----------------------------------------------------------");
		log.info("Method invokatin is start");
		log.info("-----------------------------------------------------------");
		proceed.proceed();
		log.info("-----------------------------------------------------------");
		log.info("Method invokatin is finish");
		log.info("-----------------------------------------------------------");
	}
	
	
}
