package com.springcore_2.ThroughXml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/springcore_2/ThroughXml/config.xml");
		A a1= (A) context.getBean("A");
		context.registerShutdownHook();
		System.out.println(a1);
	}

}
