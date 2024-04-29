package com.mphasis.book.repository;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.book.domain.Book;

@Repository
@Scope("singleton")
public interface BookStoreRepository extends JpaRepository<Book, Integer> {

	public List<Book>findByBookTitleLike(String bookTitle);
	
	public List<Book>findByBookPublisherLike(String bookPublisher);
	
	public List<Book>findByBookYear(int bookYear);
}
