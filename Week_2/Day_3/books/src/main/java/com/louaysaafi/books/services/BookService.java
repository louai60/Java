package com.louaysaafi.books.services;

import com.louaysaafi.books.models.Book;
import com.louaysaafi.books.repositrories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> allBooks() {
        return bookRepository.findAll();
    }

    public Book createBook(Book b) {
        return bookRepository.save(b);
    }

    public Book findBook(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book updateBook(Book b) {
        return bookRepository.save(b);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
