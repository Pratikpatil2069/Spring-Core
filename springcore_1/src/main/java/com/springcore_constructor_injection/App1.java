package com.springcore_constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/* 
 * Here i use  constructor to inject the object data,
 * then i creates new .xml file and create the beans for constructor injections. */


public class App1 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore_constructor_injection/Constructor_Configuration.xml");
		StudentModel1 s1= (StudentModel1) context.getBean("student1");
		System.out.println(s1);
		StudentModel1 s2= (StudentModel1) context.getBean("student2");
		System.out.println(s2);
		StudentModel1 s3= (StudentModel1) context.getBean("student3");
		System.out.println(s3);

	}

}
