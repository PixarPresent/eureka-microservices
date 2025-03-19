package com.example.wow.bookservice.config;

import com.example.wow.bookservice.model.Book;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.Arrays;
import java.util.List;

@Configuration
@AllArgsConstructor
public class DataBaseConfig {


    @Autowired
    private final MongoTemplate mongoTemplate;

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            // Создаем список книг для сохранения в базу данных
            List<Book> books = Arrays.asList(
                    Book.builder().title("Book 1").description("Description 1").imageLink("Link 1").build(),
                    Book.builder().title("Book 2").description("Description 2").imageLink("Link 2").build(),
                    Book.builder().title("Book 3").description("Description 3").imageLink("Link 3").build()
            );

            mongoTemplate.insertAll(books);
        };
    }
}