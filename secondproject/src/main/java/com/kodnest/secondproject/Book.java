package com.kodnest.secondproject;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int bookid;
	
	@Column(name="bookname")
	String name;
	int price;
	String author;
	String publisher;
	
	public Book() {
		
	}
	
	
	



	public Book(int bookid, String name, int price, String author, String publisher) {
		super();
		this.bookid = bookid;
		this.name = name;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
	}

	




	public Book(String name, int price, String author, String publisher) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
	}






	public int getBookid() {
		return bookid;
	}






	public void setBookid(int bookid) {
		this.bookid = bookid;
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public int getPrice() {
		return price;
	}






	public void setPrice(int price) {
		this.price = price;
	}






	public String getAuthor() {
		return author;
	}






	public void setAuthor(String author) {
		this.author = author;
	}






	public String getPublisher() {
		return publisher;
	}






	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}






	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", name=" + name + ", price=" + price + ", author=" + author + ", publisher="
				+ publisher + "]";
	}






	@Override
	public int hashCode() {
		return Objects.hash(author, bookid, name, price, publisher);
	}






	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && bookid == other.bookid && Objects.equals(name, other.name)
				&& price == other.price && Objects.equals(publisher, other.publisher);
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
