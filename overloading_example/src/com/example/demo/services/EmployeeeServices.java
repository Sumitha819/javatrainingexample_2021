package com.example.demo.services;//package declaration
import com.example.demo.model.*;//import declaration
public class EmployeeeServices//class declaration
{
	//DRY(dont repeat yourself) principle followed
	public double calculateBonus(Employee employee) {
		return calculateBonus(employee.getSalary());
	}
	/*overload method(same name(calculate bonus) 
	diff argument((Employee employee)and(double salary)))*/
	public double calculateBonus(double salary) {
		return salary*.30;
	}
	//overload method with auto boxing
	public double calculateBonus(Double salary) {
		return( salary *0.30)+1000;
	}
	//pass by value
	public Employee updateSalary(Employee employee) {
		double upadtedSalary = employee.getSalary()+20000;
		employee.setSalary(upadtedSalary);
		return employee;
	}
}
