package com.louaysaafi.books.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.louaysaafi.books.models.Book;
import com.louaysaafi.books.services.BookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/books")
public class BooksApi {

    private final BookService service;

    public BooksApi(BookService service) {
        this.service = service;
    }

    @GetMapping
    public List<Book> index() {
        return service.allBooks();
    }

    @PostMapping
    public Book create(@Valid @RequestBody Book book) {
        return service.createBook(book);
    }

    @GetMapping("/{id}")
    public Book show(@PathVariable("id") Long id) {
        return service.findBook(id);
    }

    @PutMapping("/{id}")
    public Book update(
            @PathVariable("id") Long id,
            @Valid @RequestBody Book bookDetails) {

        Book book = service.findBook(id);
        if (book != null) {
            book.setTitle(bookDetails.getTitle());
            book.setDescription(bookDetails.getDescription());
            book.setLanguage(bookDetails.getLanguage());
            book.setNumberOfPages(bookDetails.getNumberOfPages());
            return service.updateBook(book);
        } else {
            return null; // or throw an appropriate exception
        }
    }

    @DeleteMapping("/{id}")
    public void destroy(@PathVariable("id") Long id) {
        service.deleteBook(id);
    }
}
