package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.buslogic.User;

public class AOPApp {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-User.xml");

		User usr = (User) appContext.getBean("userObj");
		usr.addNewUser();

		 //usr.addNewUserReturnValue();

//		 try {
//			usr.addNewUserThrowException();
//		} catch (Exception e) {
//			System.out.println("Exception Occured......");
//		}

		//usr.addNewUserAround("Harish Manana");

	}

}
