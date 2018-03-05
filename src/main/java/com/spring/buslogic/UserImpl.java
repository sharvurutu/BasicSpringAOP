package com.spring.buslogic;

public class UserImpl implements User{
	public void addNewUser() {
		System.out.println("addNewUser() is running ...");
	}

	public void addNewUserThrowException() throws Exception {
		System.out.println("addNewUserThrowException() is running ....");
		throw new Exception();
	}

	public void addNewUserAround(String username) {
		System.out.println("addNewUserAround() is running ....");
	}

	public String addNewUserReturnValue() {
		System.out.println("addNewUserReturnValue() is running ....");
		return "Harish Manana";
	}

}
