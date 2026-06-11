package com.springcore_reference_obj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceObj {


 public static void main(String[] args) {
	 ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore_reference_obj/ref.xml");
	 A a=(A) context.getBean("A");
	 System.out.println(a);
	 A a1=(A) context.getBean("C");
	 System.out.println(a1);
	 A a2=(A) context.getBean("E");
	 System.out.println(a2);
	 
	 B b=(B) context.getBean("B");
	 System.out.println(b);
	 B b1=(B) context.getBean("D");
	 System.out.println(b1);
	 B b2=(B) context.getBean("F");
	 System.out.println(b2);
 } 

}
