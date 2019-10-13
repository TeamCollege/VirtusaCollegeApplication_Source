package com.virtusa.entities;

public class Faculty extends User
{
	private int facultyId;
	private String courseName;
	private String departmentName;
	private double salary;
	public int getFacultyId() 
	{
		return facultyId;
	}
	public void setFacultyId(int facultyId)
	{
		this.facultyId = facultyId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
