package com.antriksh.aop;

import org.springframework.stereotype.Component;

@Component
public class Student {

	public int studyAnything(int a, int b) {
		System.out.println("I am in college and studying right now");
		return 660;
	}
	public String doOperation() {
		throw new MyException("This is my exception");
	}
}
