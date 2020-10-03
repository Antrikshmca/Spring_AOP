package com.antriksh.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {

	/*
	 * @Before("myPointCuts()") public void wakeUp(JoinPoint p) {
	 * System.out.println("good morning " + p); }
	 * 
	 * @After("myPointCuts()") public void sleep() {
	 * System.out.println("good night "); }
	 * 
	 * @Pointcut("execution(public * study*(..))") public void myPointCuts() {
	 * 
	 * }
	 */
	@AfterReturning(pointcut="execution( * study*(..))",returning="numValue")
	public void wakeUp(int numValue) {
		System.out.println("study* method returning value "+ numValue );
	}
	@AfterThrowing(pointcut="execution( * study*(..))",throwing="ex")
	public void wakeUp(MyException ex) {
		System.out.println("This is my throw exception "+ ex );
	}
}
