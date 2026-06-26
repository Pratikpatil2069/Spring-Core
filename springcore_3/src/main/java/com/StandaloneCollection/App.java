package com.StandaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/StandaloneCollection/Standalone.xml");
		Students s1= context.getBean("student",Students.class);
		System.out.println(s1);
		
	}

}
