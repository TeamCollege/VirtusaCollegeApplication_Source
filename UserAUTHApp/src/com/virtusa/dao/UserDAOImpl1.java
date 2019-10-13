package com.virtusa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class UserDAOImpl1 implements UserDAO {
	
	public boolean userAuth(String userName,String password)throws ClassNotFoundException, SQLException{
		String role="";
		Connection connection=ConnectionManager.openConnection();
	/**	query1="select count(*) from user_credentials where username=? AND user_password=?";
		PreparedStatement preparedStatement1=connection.prepareStatement(query1);
			preparedStatement1.setString(1, userId);
			preparedStatement1.setString(2, password);
			ResultSet rs1 = preparedStatement1.executeQuery();
			rs1.next();
			if (rs1.getInt(1)>0) {**/
				String query2="select role from user_credentials where username=? and password=?";
			PreparedStatement preparedStatement2=connection.prepareStatement(query2);
			preparedStatement2.setString(1, userName);
			preparedStatement2.setString(2, password);
			ResultSet rs2 = preparedStatement2.executeQuery();
			while(rs2.next()) 
			role=rs2.getString("role");
			
			return role;
			
		
	}

	/*
	 * @Override public String retrieveUserType(String userName) { // TODO
	 * Auto-generated method stub return null; }
	 */
		
	}


