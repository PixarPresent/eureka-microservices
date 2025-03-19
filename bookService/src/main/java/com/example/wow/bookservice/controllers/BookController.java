package com.example.wow.bookservice.controllers;

import com.example.wow.bookservice.model.Book;
import com.example.wow.bookservice.service.BookServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@AllArgsConstructor
public class BookController {

    private final BookServiceImpl bookServiceImpl;

    @GetMapping
    List<Book> getAllBooks() {
        return bookServiceImpl.findAllBooks();
    }
}
