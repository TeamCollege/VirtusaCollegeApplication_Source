package com.virtusa.entities;

public class Alumni 
{
	private int alumniId;
	private int courseId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String  yearOfCompletition;
	private String presentStatus;
	private String dateOfBirth;
	private String gender;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getAlumniId() {
		return alumniId;
	}
	public void setAlumniId(int alumniId) {
		this.alumniId = alumniId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getYearOfCompletition() {
		return yearOfCompletition;
	}
	public void setYearOfCompletition(String yearOfCompletition) {
		this.yearOfCompletition = yearOfCompletition;
	}
	public String getPresentStatus() {
		return presentStatus;
	}
	public void setPresentStatus(String presentStatus) {
		this.presentStatus = presentStatus;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) { 
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Alumni [alumniId=" + alumniId + ", courseId=" + courseId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", phoneNumber=" + phoneNumber + ", email=" + email + ", yearOfCompletition="
				+ yearOfCompletition + ", presentStatus=" + presentStatus + ", dateOfBirth=" + dateOfBirth + ", gender="
				+ gender + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getPhoneNumber()=" + getPhoneNumber() + ", getEmail()=" + getEmail() + ", getAlumniId()="
				+ getAlumniId() + ", getCourseId()=" + getCourseId() + ", getYearOfCompletition()="
				+ getYearOfCompletition() + ", getPresentStatus()=" + getPresentStatus() + ", getDateOfBirth()="
				+ getDateOfBirth() + ", getGender()=" + getGender() + "]";
	}
	
	


	
}
