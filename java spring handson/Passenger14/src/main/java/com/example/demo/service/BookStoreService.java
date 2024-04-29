// BookStoreService.java
package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookStoreService {

    @Autowired
    private BookStoreRepository repository;

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return repository.findById(id);
    }

    public Book addBook(Book book) {
        return repository.save(book);
    }

    public void updateBook(Long id, Book updatedBook) {
        if (repository.existsById(id)) {
            updatedBook.setId(id);
            repository.save(updatedBook);
        }
    }

    public void deleteBook(Long id) {
        repository.deleteById(id);
    }

    public List<Book> findByTitle(String title) {
        return repository.findByTitle(title);
    }

    public List<Book> findByPublisherLike(String publisher) {
        return repository.findByPublisherLike(publisher);
    }

    public List<Book> findByYear(int year) {
        return repository.findByYear(year);
    }
}
