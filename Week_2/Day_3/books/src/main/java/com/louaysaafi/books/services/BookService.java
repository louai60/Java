package com.louaysaafi.books.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.louaysaafi.books.models.Book;
import com.louaysaafi.books.repositrories.BookRepository;

@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Method to update a book
    public Book updateBook(Long id, String title, String description, String language, Integer numOfPages) {
        Book bookToUpdate = bookRepository.findById(id).orElse(null);
        if (bookToUpdate != null) {
            bookToUpdate.setTitle(title);
            bookToUpdate.setDescription(description);
            bookToUpdate.setLanguage(language);
            bookToUpdate.setNumberOfPages(numOfPages);
            return bookRepository.save(bookToUpdate);
        }
        return null; // Or throw an exception indicating the book was not found
    }

    // Method to delete a book
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
