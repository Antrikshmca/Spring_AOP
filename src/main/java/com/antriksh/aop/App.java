
package com.antriksh.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	
	public static void main(String[] args) {
		
		AbstractApplicationContext con= new AnnotationConfigApplicationContext(AppConfig.class);
		Student st = con.getBean("student",Student.class);
		//jointpoint
		st.studyAnything();
		
		Employee emp = con.getBean("employee",Employee.class);
		emp.studySomething();
		
	}
}
