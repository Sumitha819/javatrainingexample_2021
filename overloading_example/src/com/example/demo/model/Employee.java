package com.example.demo.model;

public class Employee {
  private int employeeId;
  private String employeeeName;
  private String designation;
  private double salary;
/**
 * @param employeeId
 * @param employeeeName
 * @param designation
 * @param salary
 */
public Employee(int employeeId, String employeeeName, String designation, double salary) {
	super();
	this.employeeId = employeeId;
	this.employeeeName = employeeeName;
	this.designation = designation;
	this.salary = salary;
}
/**
 * 
 */
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeeName() {
	return employeeeName;
}
public void setEmployeeeName(String employeeeName) {
	this.employeeeName = employeeeName;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
	
}
