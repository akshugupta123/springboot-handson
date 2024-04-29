package com.mphasis.book.service;

import java.util.List;

import com.mphasis.book.domain.Book;

public interface BookService {

	public Book addBook(Book book);
	
	public Book updateBook(Book book);
	
	public void deleteBook(String id);
	
//	public List<Book>findAllBooks();
	
//	List<Book>findBybook_titleLike(String book_title); 
		
		
}
