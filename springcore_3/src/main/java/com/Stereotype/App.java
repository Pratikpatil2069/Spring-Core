package com.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/Stereotype/Stereotype.xml");
		Students s1= context.getBean("students",Students.class);
		System.out.println(s1);
		
	}
//	In this project i learn how without creating beans in xml file we can create the object of pojo class.
//	@Component annotation used to created the object of pojo class .
//	@Value("Pratik") is this annotation is used to pass the value to ioc container through beans,
//	then ioc container created the object ,
//	this contains data if we dont pass the values then the fields are null.
// then it return that object where the required using @Autowired.
// for passing list as value then creted the standalone collection in xml file .
// and pass usinf @Value("#{list}") this is called spring expresion value.
}
