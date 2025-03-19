package com.example.wow.configclient.controllers;

import com.example.wow.configclient.model.Book;
import com.example.wow.configclient.util.FeignDemoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/info")
public class InfoController {

//    @Autowired
//    private FeignDemoUtil feignDemoUtil;
//
//    @GetMapping("/name")
//    public String getConfigName() {
//        return feignDemoUtil.getConfigName();
//    }

    @Autowired
    private FeignDemoUtil feignDemoUtil;

    @GetMapping("/books")
    public List<Book> books() {
        return feignDemoUtil.getAllBooks();
    }
}
