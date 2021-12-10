package com.training;

public class Application {

	public static void main(String[] args) {
		
		Student ram = new Student();
//		System.out.println(ram.firstName);//can't be accesed coz its marked private
		System.out.println(ram.fees);//can be accesed coz its marked default/package

	}

}
