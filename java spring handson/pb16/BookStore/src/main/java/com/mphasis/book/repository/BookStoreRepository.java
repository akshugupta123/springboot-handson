package com.mphasis.book.repository;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository; 
import com.mphasis.book.domain.Book;

@Repository
@Scope("singleton")
public interface BookStoreRepository extends MongoRepository<Book, String> {

	//List<Book>findBybook_titleLike(String book_title); 
	
}
