package com.virtusa.entities;

public class Faculty extends User {
	
	private String facultyId;

	public String getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}

	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber
				+ ", userType=" + userType + ", getFacultyId()=" + getFacultyId() + ", getUserName()=" + getUserName()
				+ ", getPassword()=" + getPassword() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getDateOfBirth()=" + getDateOfBirth() + ", getEmailAddress()=" + getEmailAddress()
				+ ", getPhoneNumber()=" + getPhoneNumber() + ", getUserType()=" + getUserType() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	

}
