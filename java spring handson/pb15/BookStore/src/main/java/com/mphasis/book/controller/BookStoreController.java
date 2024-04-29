package com.mphasis.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		return bookServiceImpl.addBook(book);
	}
	
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book) {
		return bookServiceImpl.updateBook(book);
	}
	
	@GetMapping("/books")
	public List<Book>findAllBooks(){
		return bookServiceImpl.findAllBooks();
		
	}
	
	@GetMapping("/books/{id}")
	public Book findAllBooksById(@PathVariable int id) {
		return bookServiceImpl.findAllBooksById(id);
	}
	
	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable int id) {
		bookServiceImpl.deleteBook(id);
	}
	
	@GetMapping("/booksTitle/{bookTitle}")
	public List<Book> findByBookTitle(@PathVariable String bookTitle){
		return bookServiceImpl.findByBookTitle(bookTitle);
	}
    
	@GetMapping("/booksPublisher/{bookPublisher}")
	public List<Book> findByBookPublisher(@PathVariable String bookPublisher){
		return bookServiceImpl.findByBookPublisher(bookPublisher);
	}
	
	@GetMapping("/booksYear/{bookYear}")
	public List<Book>findByBookYear(@PathVariable int bookYear){
		return bookServiceImpl.findByBookYear(bookYear);
	}
}
