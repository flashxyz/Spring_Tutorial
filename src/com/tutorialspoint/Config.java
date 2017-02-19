package com.tutorialspoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
	
//	@Bean
//	String message(){
//		return "HelloWorld1212";
//	}
//	@Bean
//	int editableNumber(){
//		return 16;
//	}
//	
	@Bean(destroyMethod = "destroy", initMethod = "init")
	@Scope("singleton")
	HelloWorld helloWorld(){
		HelloWorld helloWorlds = new HelloWorld();
		helloWorlds.setMessage("HELLO WORLD");
		return helloWorlds;
	}
//	
//	@Bean
//	HelloWorld helloWorld1(){
//		HelloWorld helloWorlds = new HelloWorld();
//		helloWorlds.setMessage("HELLO WORLD1");
//		return helloWorlds;
//	}
	

}
