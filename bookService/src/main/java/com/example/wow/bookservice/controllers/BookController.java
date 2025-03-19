package com.example.wow.bookservice.controllers;

import com.example.wow.bookservice.model.Book;
import com.example.wow.bookservice.service.BookServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    BookServiceImpl bookServiceImpl;

    @GetMapping
    List<Book> getAllBooks() {
        return bookServiceImpl.findAllBooks();
    }
}
