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
		bookStoreRepository.save(new Book("Tinkle","comics",789-456-123,200,1998));
		bookStoreRepository.save(new Book("marvel","series",654-956-183,200,2000));
		bookStoreRepository.save(new Book("richdad","comics",659-878-698,200,2006));
		bookStoreRepository.save(new Book("poordad","comics",111-352-154,200,2003));
	}

	public BookStoreRepository getBookStoreRepository() {
		return bookStoreRepository;
	}

	public void setBookStoreRepository(BookStoreRepository bookStoreRepository) {
		this.bookStoreRepository = bookStoreRepository;
	}

	
	
	
	
}
