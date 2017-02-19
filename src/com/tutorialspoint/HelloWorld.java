package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

   private String message;

   private int editableNumber;

   public int getEditableNumber() {
		return editableNumber;
   }

   public void setEditableNumber(int editableNumber) {
		this.editableNumber = editableNumber;
	}

	public void setMessage(String message){
		this.message  = message;
	}

	public void getMessage(){
		System.out.println("Your Message : " + message + " num: " + editableNumber);
	}
	
	 public void init(){
	      System.out.println("Bean is going through init.");
	   }
	   public void destroy(){
	      System.out.println("Bean will destroy now.");
	   }
}
