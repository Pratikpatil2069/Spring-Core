package com.springcore_NonPrimitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/* 
 * Here i use  non primitive data type in pojo and creates getter and setter,
 * then i creates new .xml file and create the beans of non primitive data types. */


public class App1 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore1/Configuration.xml");
		StudentModel1 s1= (StudentModel1) context.getBean("student1");
		System.out.println(s1);

	}

}
