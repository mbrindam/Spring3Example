package com.heuristictech.core;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring3example-context.xml");
 
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
	}
}
