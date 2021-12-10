package com.training;

public class BookApplication {

	public static void main(String[] args) {
		Book headFirst = new Book();
		headFirst.setAuthorName("tom");
		headFirst.setBookId(101);
		headFirst.setPrice(150);
		System.out.println(headFirst.getAuthorName());
		System.out.println(headFirst.getBookId());
		System.out.println(headFirst.getPrice());
		//parameterized argument constructor down
		Book effJava = new Book(102,"Effective java",560.00);
		System.out.println( effJava.getAuthorName());
		System.out.println( effJava.getBookId());
		System.out.println( effJava.getPrice());

	}

}
