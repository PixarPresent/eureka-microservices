package com.example.wow.bookservice.service;

import com.example.wow.bookservice.model.Book;
import com.example.wow.bookservice.repository.BookRepository;
import io.micrometer.observation.annotation.Observed;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;


    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}
