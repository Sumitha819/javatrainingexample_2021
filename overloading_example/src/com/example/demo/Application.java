package com.example.demo;

import com.example.demo.model.Employee;

import com.example.demo.model.Invoice;

import java.util.Scanner;

import com.example.demo.services.EmployeeeServices;

public class Application {
	 
	public static void main(String[] args) {
		
		//using wrapper class ,parsing the string representation to respective types
		
		int employeeId = Integer.parseInt(args[0]);
		
		String employeeName = args[1];
		
		String designation = args[1];
		
		double salary = Double.parseDouble(args[3]);
		
		Employee ram = new Employee(100,"shan","dev",50000);
		
		//scanner
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the employee Id");
			int empID = sc.nextInt();

		System.out.println("enter the employee Name ");
			String empName = sc.next();
		
		System.out.println("enter the employee Designation");
			String desig = sc.next();
		
		System.out.println("enter the employee Salary");
			double empSal = sc.nextDouble();
		
		Employee suresh = new Employee(400, "sam", "designer", 60000);
		
		sc.close();
		
		//calling overload method
		
		EmployeeeServices service = new EmployeeeServices();
		
		System.out.println("Expected:15000 => Actual:=" + service.calculateBonus(ram));
		
		System.out.println("Expected:18000 => Actual:=" + service.calculateBonus(suresh.getSalary()));
		
		Double salary2 = Double.valueOf(50000);
		
		int intSalary2 =(int) (salary2.doubleValue());
		
		double salary3 = salary2.doubleValue();
		
		 int salary4 = (int)salary3;
		 
		System.out.println("Expected:16000 =>Actual:=" +service.calculateBonus(salary2));
		
		Employee resh = new Employee(400, "samson", "manager", 70000);
		
		System.out.println("before:="+resh.getSalary());
		
		service.updateSalary(resh);
		
		System.out.println("after:="+resh.getSalary());
		
		System.out.println("Expected:90000 => Actual:="+resh.getSalary());
		
		Invoice.showAll();
	}
}
