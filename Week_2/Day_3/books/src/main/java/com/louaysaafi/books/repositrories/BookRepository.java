package com.louaysaafi.books.repositrories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.louaysaafi.books.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findAll();

}