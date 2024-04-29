package com.mphasis.book.service;

import java.util.List;

import com.mphasis.book.domain.Book;

public interface BookService {

	public Book addBook(Book book);
	
	public Book updateBook(Book book);
	
	public List<Book>findAllBooks();
	
	public Book findAllBooksById(int id);
	
	public void deleteBook(int id);
	
	public List<Book>findByBookTitle(String bookTitle);
	
	public List<Book>findByBookPublisher(String bookPublisher);	
		
	public List<Book>findByBookYear(int bookYear);
}
