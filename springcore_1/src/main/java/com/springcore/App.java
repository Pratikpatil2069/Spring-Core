package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * first here i created the maven project.
 * file-new-meven project-next-meven Archetype quickstart-next-write project name ,package name and finish.
 * then add dependencies in pom.xml from maven dependency.
 * 1.spring core:-It provides:
								Dependency Injection (DI) support
								Inversion of Control (IoC) concepts
								Utility classes
								Core container functionality

								Think of it as the engine of Spring.
 * 2 spring context:-It provides:

								ApplicationContext
								Bean management
								Component scanning (@Component, @Service, @Repository)
								Event handling
								Resource loading
	
 * now create simple pojo class.
 * for getter , setter and constructor sortcut source-getter/setter.
 * 
 * then create the .xml file for configuration . write click on src/main/java-new-file and write file name with extension and add default code manually.
 * 
 * then create the bean of pojo and create object from ioc with the help of ApplicationContext interface.
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentModel s1=(StudentModel)context.getBean("student1");
        System.out.println(s1);
    }
}
