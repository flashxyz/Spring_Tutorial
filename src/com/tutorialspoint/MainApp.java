package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	   public static void main(String[] args) {
		      ApplicationContext context = new AnnotationConfigApplicationContext("com.tutorialspoint");

//		      HelloWorld obj = (HelloWorld) context.getBean(HelloWorld.class);
//		      obj.getMessage();

		      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

		      objA.setMessage("I'm object A");
		      objA.getMessage();

		      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
		      objB.getMessage();
		      ((AbstractApplicationContext) context).registerShutdownHook();

		      
		   }

}
