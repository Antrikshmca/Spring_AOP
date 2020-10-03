
package com.antriksh.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	
	public static void main(String[] args) {
		
		AbstractApplicationContext con= new AnnotationConfigApplicationContext(AppConfig.class);
		Student st = con.getBean("student",Student.class);
		//jointpoint
		int s=st.studyAnything(7,9);
		System.out.println("returning value "+ s);
		
		st.doOperation();
		
		/*
		 * Employee emp = con.getBean("employee",Employee.class); emp.studySomething();
		 */
		
	}
}
