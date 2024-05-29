package com.louaysaafi.books.controllers;

import java.util.List;

import com.louaysaafi.books.models.Book;
import com.louaysaafi.books.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/books/{id}")
    public String showBook(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findBook(id);
        if (book != null) {
            model.addAttribute("book", book);
            return "show";
        }
        return "error"; // Or handle it differently, e.g., redirect to an error page
    }

    @RequestMapping("/books")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "index";
    }
}



