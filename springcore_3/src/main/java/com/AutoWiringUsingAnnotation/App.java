package com.AutoWiringUsingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/AutoWiringUsingAnnotation/AutowireUsingAnnotation.xml");
		Emp emp=context.getBean("emp",Emp.class);
		System.out.println(emp);

	}

}
