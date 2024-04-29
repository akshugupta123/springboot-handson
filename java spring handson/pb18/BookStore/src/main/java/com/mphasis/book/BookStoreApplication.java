package com.mphasis.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mphasis.book.domain.Book;
import com.mphasis.book.repository.BookStoreRepository;

@SpringBootApplication
public class BookStoreApplication  implements CommandLineRunner {
    
	@Autowired
	@Qualifier("bookStoreRepository")
	private BookStoreRepository bookStoreRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bookStoreRepository.save(new Book(789,"Tinkle","comics",789-456-123,200,1998));
		bookStoreRepository.save(new Book(456,"marvel","action",789-456-123,300,1999));
		bookStoreRepository.save(new Book(123,"richdad","comics",789-456-123,400,2000));
		bookStoreRepository.save(new Book(666,"poordad","comics",789-456-123,500,2001));
	}

	public BookStoreRepository getBookStoreRepository() {
		return bookStoreRepository;
	}

	public void setBookStoreRepository(BookStoreRepository bookStoreRepository) {
		this.bookStoreRepository = bookStoreRepository;
	}

	
	
	
	
}
