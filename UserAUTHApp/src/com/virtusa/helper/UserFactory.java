package com.virtusa.helper;

import com.virtusa.dao.UserDAO;
//import com.virtusa.dao.UserDAOImpl;
import com.virtusa.dao.UserDAOImpl1;
import com.virtusa.service.UserService;
import com.virtusa.service.UserServiceImpl;

public class UserFactory {
//changed 13.10.19
	public static UserDAO createUserDAO() {
		UserDAO userDAO=new UserDAOImpl1();
		return userDAO;
	}
	
	public static UserService createUserService() {
		UserService userService=new UserServiceImpl();
		return userService;
	}
}
