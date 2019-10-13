package com.virtusa.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.virtusa.controller.FrontController;

public class ConsoleUI {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		try(
			InputStreamReader reader=
			new InputStreamReader(System.in);
				BufferedReader buffer=new BufferedReader(reader);
				
	     ){
			
			System.out.print("Enter UserName:");
			String userName=buffer.readLine().trim();
			
			System.out.print("Enter Password:");
			String password=buffer.readLine().trim();
			
			FrontController controller=new FrontController();
			controller.userAuthentication(userName, password);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
