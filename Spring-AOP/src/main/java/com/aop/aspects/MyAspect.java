package com.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;

@Aspect
@Component
public class MyAspect {

	@Before("execution(* com.aop.services.*.*(..))")
	public void logBefore(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		String className = joinPoint.getTarget().getClass().getSimpleName();

		System.out.println("START: " + className + " -> " + methodName);
	}

	@After("execution(* com.aop.services.*.*(..))")
	public void logAfter(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		String className = joinPoint.getTarget().getClass().getSimpleName();

		System.out.println("END: " + className + " -> " + methodName);

	}

//	advance level with logger

	private static final Logger logger = (Logger) LoggerFactory.getLogger(MyAspect.class);

	@Around("execution(* com.aop.services.*.*(..))")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		String methodName = joinPoint.getSignature().getName();
		String className = joinPoint.getTarget().getClass().getSimpleName();

		logger.info("START: {} -> {}", className, methodName);

		long startTime = System.currentTimeMillis();

		Object result = joinPoint.proceed(); // actual method call

		long endTime = System.currentTimeMillis();

		logger.info("END: {} -> {} | Time Taken: {} ms", className, methodName, (endTime - startTime));

		return result;
	}
}
