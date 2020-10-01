package com.antriksh.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {

	@Before("myPointCuts()")
	public void wakeUp() {
		System.out.println("good morning ");
	}
	
	@After("myPointCuts()")
	public void sleep() {
		System.out.println("good night ");
	}
	@Pointcut("execution(public * study*())")
	public void myPointCuts() {
		
	}
	
}
