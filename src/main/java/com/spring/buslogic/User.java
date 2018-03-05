package com.spring.buslogic;

public interface User {
	public void addNewUser();
	public void addNewUserThrowException() throws Exception;
	public void addNewUserAround(String username);
	public String addNewUserReturnValue();
}
