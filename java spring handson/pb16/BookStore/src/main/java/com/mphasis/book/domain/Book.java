package com.mphasis.book.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;

//@Entity
//@Table(name="book")

@Document
public class Book {
    
	@Id
	private String id;
	
	
	private String book_title;
	
	
	private String book_publisher;
	
	
	private Integer book_isbn;
	
	
	private Integer book_number_of_pages;
	
	
	private Integer book_year;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getBook_title() {
		return book_title;
	}


	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}


	public String getBook_publisher() {
		return book_publisher;
	}


	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}


	public Integer getBook_isbn() {
		return book_isbn;
	}


	public void setBook_isbn(Integer book_isbn) {
		this.book_isbn = book_isbn;
	}


	public Integer getBook_number_of_pages() {
		return book_number_of_pages;
	}


	public void setBook_number_of_pages(Integer book_number_of_pages) {
		this.book_number_of_pages = book_number_of_pages;
	}


	public Integer getBook_year() {
		return book_year;
	}


	public void setBook_year(Integer book_year) {
		this.book_year = book_year;
	}


	public Book(String id, String book_title, String book_publisher, Integer book_isbn, Integer book_number_of_pages,
			Integer book_year) {
		super();
		this.id = id;
		this.book_title = book_title;
		this.book_publisher = book_publisher;
		this.book_isbn = book_isbn;
		this.book_number_of_pages = book_number_of_pages;
		this.book_year = book_year;
	}


	public Book(String book_title, String book_publisher, Integer book_isbn, Integer book_number_of_pages,
			Integer book_year) {
		super();
		this.book_title = book_title;
		this.book_publisher = book_publisher;
		this.book_isbn = book_isbn;
		this.book_number_of_pages = book_number_of_pages;
		this.book_year = book_year;
	}


	public Book() {
		super();
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", book_title=" + book_title + ", book_publisher=" + book_publisher + ", book_isbn="
				+ book_isbn + ", book_number_of_pages=" + book_number_of_pages + ", book_year=" + book_year + "]";
	}
	
	
	
}
