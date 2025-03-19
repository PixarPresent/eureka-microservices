package com.example.wow.bookservice.service;

import com.example.wow.bookservice.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    List<Book> findAllBooks();
}
