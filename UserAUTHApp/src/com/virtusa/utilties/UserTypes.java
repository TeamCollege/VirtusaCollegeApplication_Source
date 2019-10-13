package com.virtusa.utilties;
/*
 * 
 */
public enum UserTypes {
	
	STUDENT("STUDENT"),ADMIN("ADMIN"),FACULTY("FACULTY"),ALUMNI("ALUMNI");
	
	private String val;
	private UserTypes(String val) {
		this.val=val;
	}
	
	public String getVal() {
		return val;
		
	}

}
