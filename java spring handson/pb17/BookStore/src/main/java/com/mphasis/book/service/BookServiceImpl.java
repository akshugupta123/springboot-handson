package com.mphasis.book.service;

import java.util.List;

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
	
	
	//public List<Book>findAllBooks(){
	//	return bookStoreRepository.findAll();
	//}
	
	public Book addBook(Book book) {
		bookStoreRepository.save(book);
		return book;
	}

	public Book updateBook(Book book) {
		bookStoreRepository.save(book);
		return book;
	}
	
	public void deleteBook(String id) {
	 bookStoreRepository.deleteById(id);
		
	}

	public BookStoreRepository getBookStoreRepository() {
		return bookStoreRepository;
	}

	public void setBookStoreRepository(BookStoreRepository bookStoreRepository) {
		this.bookStoreRepository = bookStoreRepository;
	}

	

	//@Override
	//public List<Book> findBybook_titleLike(String book_title) {
	//	return bookStoreRepository.findBybook_titleLike(book_title);
	//}

	

	
	

}
