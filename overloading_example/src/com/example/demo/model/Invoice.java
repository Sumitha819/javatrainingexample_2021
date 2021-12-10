package com.example.demo.model;
import static java.lang.Math.*;
public class Invoice {
	//declaring a constant
	//constant should be declared in capital letter
	public static final int STARTNUMBER=100;//here final means no changes can be done
	
 private int invoiceNumber;//instance var
 
 private static double discount;//static  or class var
 /*
  * instance method can acces both instance and static variables
  */
 public void show() {
	 
	 System.out.println(invoiceNumber);
	 
	 System.out.println(discount);
 }
 /*
  * static method can accres ONLY static variable
  */
 public static void showAll() {
	 
	 //System.out.println(invoiceNumber); //it will show error coz we cant call instance var in static
	 
	 //show();//cant access show
	 
	 System.out.println(discount);
	 
	 //example
	 //since static import is used we are not calling the method wioth class name
//	 System.out.println(sqrt(4));
//	 
//	 double radian30 = toRadians(30);
//	 
//	 double radian60 = toRadians(60);
//	 
//	 System.out.println(sin(radian30));
//	 
//	 System.out.println(cos(radian60));
 }
 
}
