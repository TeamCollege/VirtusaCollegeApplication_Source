package com.virtusa.entities;

public class Alumni extends User {
	private String alumniId;

	public String getAlumniId() {
		return alumniId;
	}

	public void setAlumniId(String alumniId) {
		this.alumniId = alumniId;
	}

	@Override
	public String toString() {
		return "Alumni [alumniId=" + alumniId + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber + ", userType="
				+ userType + ", getAlumniId()=" + getAlumniId() + ", getUserName()=" + getUserName()
				+ ", getPassword()=" + getPassword() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getDateOfBirth()=" + getDateOfBirth() + ", getEmailAddress()=" + getEmailAddress()
				+ ", getPhoneNumber()=" + getPhoneNumber() + ", getUserType()=" + getUserType() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	
	

	
	
	

}
