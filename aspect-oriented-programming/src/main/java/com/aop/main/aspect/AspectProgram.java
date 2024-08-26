package com.aop.main.aspect;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class AspectProgram {
	
	Logger logger = Logger.getLogger(AspectProgram.class.getName());
	
	@Around("execution(* com.aop.main.services.*.*(..))")
	String log(ProceedingJoinPoint pj) {
		logger.info(pj.getSignature().toString()+" method execution started");
		Instant start = Instant.now();
		String res="";
		try {
			 res = (String) pj.proceed();
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
		Instant finish = Instant.now();
		long millis = Duration.between(start, finish).toMillis();
		logger.info(pj.getSignature().toString()+" method execution ended");
		logger.info("time taken "+millis);
		return res;
	}
	
	 @AfterThrowing(value = "execution(* com.aop.main.services.*.*(..))",throwing = "ex")
	    public void logException(JoinPoint joinPoint, Exception ex) {
	        logger.log(Level.SEVERE,joinPoint.getSignature()+ " An exception thrown with the help of" +
	                " @AfterThrowing which happened due to : "+ex.getMessage());
	    }

}


