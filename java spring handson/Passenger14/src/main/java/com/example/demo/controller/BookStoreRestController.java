// BookStoreRestController.java
package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookStoreRestController {

    @Autowired
    private BookStoreService service;

    @GetMapping
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable Long id) {
        return service.getBookById(id);
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return service.addBook(book);
    }

    @PutMapping("/{id}")
    public void updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        service.updateBook(id, updatedBook);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        service.deleteBook(id);
    }

    @GetMapping("/title/{title}")
    public List<Book> getByTitle(@PathVariable String title) {
        return service.findByTitle(title);
    }

    @GetMapping("/publisher/{publisher}")
    public List<Book> getByPublisher(@PathVariable String publisher) {
        return service.findByPublisherLike(publisher);
    }

    @GetMapping(params = "year")
    public List<Book> getByYear(@RequestParam int year) {
        return service.findByYear(year);
    }
}
