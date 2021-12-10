package com.training;

public class Book {
	private int bookId;
	private String authorName;
	private double price;
	/**
	 * 
	 */
	public Book() {
		//super(); either super or this but nvr both ,coz super/this shld be the frst line
		this(17,"tan",670);//select this and press f3 to find where it goes
		
	}
	/**
	 * @param bookId
	 * @param authorName
	 * @param price
	 */
	public Book(int bookId, String authorName, double price) {
		super();
		this.bookId = bookId;//this refers to current instance
		this.authorName = authorName;
		//this.authorname refers to the field private string author name
		//authorname refers to the method argument authorname
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getAuthorName() {
		
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
