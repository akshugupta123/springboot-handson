package com.mphasis.book.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="bookTitle")
	private String bookTitle;
	
	@Column(name="bookPublisher")
	private String bookPublisher;
	
	@Column(name="bookIsbn")
	private Integer bookIsbn;
	
	@Column(name="bookNumbeOfPages")
	private Integer bookNumberOfPages;
	
	@Column(name="bookYear")
	private Integer bookYear;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public Integer getBookIsbn() {
		return bookIsbn;
	}

	public void setBookIsbn(Integer bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public Integer getBookNumberOfPages() {
		return bookNumberOfPages;
	}

	public void setBookNumberOfPages(Integer bookNumberOfPages) {
		this.bookNumberOfPages = bookNumberOfPages;
	}

	public Integer getBookYear() {
		return bookYear;
	}

	public void setBookYear(Integer bookYear) {
		this.bookYear = bookYear;
	}

	public Book(Integer id, String bookTitle, String bookPublisher, Integer bookIsbn, Integer bookNumberOfPages,
			Integer bookYear) {
		super();
		this.id = id;
		this.bookTitle = bookTitle;
		this.bookPublisher = bookPublisher;
		this.bookIsbn = bookIsbn;
		this.bookNumberOfPages = bookNumberOfPages;
		this.bookYear = bookYear;
	}

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookTitle=" + bookTitle + ", bookPublisher=" + bookPublisher + ", bookIsbn="
				+ bookIsbn + ", bookNumberOfPages=" + bookNumberOfPages + ", bookYear=" + bookYear + "]";
	}
	
	
}
