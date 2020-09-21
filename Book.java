package com.amdocs;

public class Book implements Comparable<Book>{
	int bid;
	String author;
	
	
	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	float price;
	String title;

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", author=" + author + ", price=" + price
				+ ", title=" + title + "]";
	}

	
	public Book(int bid, String author, float price, String title) {
		super();
		this.bid = bid;
		this.author = author;
		this.price = price;
		this.title = title;
	}


	@Override
	public int compareTo(Book o) {
		return this.getAuthor().compareTo(o.getAuthor());
		
		/*if(this.getBid() < o.getBid())
			return -1;
		else if(this.getBid() > o.getBid())
			return 1;
		else	
		return 0;*/
	}


	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}
	
	public void incrPrice(float amt){
		price += amt;
	}

}
