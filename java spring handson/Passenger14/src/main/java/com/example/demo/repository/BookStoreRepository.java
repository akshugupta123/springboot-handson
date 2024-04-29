package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookStoreRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitle(String title);
    List<Book> findByPublisherLike(String publisher);
    List<Book> findByYear(int year);
}
