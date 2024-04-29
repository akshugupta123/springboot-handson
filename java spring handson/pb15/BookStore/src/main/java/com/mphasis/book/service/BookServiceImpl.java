package com.mphasis.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mphasis.book.domain.Book;
import com.mphasis.book.repository.BookStoreRepository;

@Service
public class BookServiceImpl implements BookService {
 
	@Autowired
	@Qualifier("bookStoreRepository")
	private BookStoreRepository bookStoreRepository;
	
	
	public List<Book>findAllBooks(){
		return bookStoreRepository.findAll();
	}
	
	public Book addBook(Book book) {
		bookStoreRepository.save(book);
		return book;
	}

	public Book updateBook(Book book) {
		bookStoreRepository.save(book);
		return book;
	}
	
	public void deleteBook(int id) {
	 bookStoreRepository.deleteById(id);
		
	}

	public BookStoreRepository getBookStoreRepository() {
		return bookStoreRepository;
	}

	public void setBookStoreRepository(BookStoreRepository bookStoreRepository) {
		this.bookStoreRepository = bookStoreRepository;
	}


	public Book findAllBooksById(int id) { 
	 	return bookStoreRepository.findById(id).get(); 
	 	}

	
	
	public List<Book> findByBookTitle(String bookTitle) {
		return   bookStoreRepository.findByBookTitleLike(bookTitle);
	    }

	
	public List<Book> findByBookPublisher(String bookPublisher) {
		return bookStoreRepository.findByBookPublisherLike(bookPublisher);
	}

	public List<Book> findByBookYear(int bookYear) {
	
		return bookStoreRepository.findByBookYear(bookYear);
	} 
	
	}
   



