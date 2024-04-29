package com.mphasis.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.book.domain.Book;
import com.mphasis.book.service.BookService;

@RestController
@Scope("request")
public class BookStoreController {
	
	@Autowired
	@Qualifier("bookServiceImpl")
	private BookService  bookServiceImpl;
	
	@RequestMapping("/")
	public String dummy() {
		return "welcome to eBookStore";
		
	}
	
	@GetMapping("/books")
	public List<Book>findAllBooks(){
		return bookServiceImpl.findAllBooks();
	 }
	
	@PostMapping("/books")
	public Book addBook(Book book) {
		return bookServiceImpl.addBook(book);
	}
	
    @DeleteMapping("/books/{id}")
	public void deleteBookById(@PathVariable String id) {
		bookServiceImpl.deleteBook(id);
	}
	
  //  @GetMapping("/bookbytitle/{book_title}")
  // public List<Book>findBybook_titleLike(String book_title){
//	return bookServiceImpl.findBybook_titleLike(book_title);
    	
//    }
    
}
