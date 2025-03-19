package com.example.wow.configclient.util;

import com.example.wow.configclient.model.Book;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@FeignClient(value = "feignDemo", url = "http://localhost:8085/api/books")
public interface FeignDemoUtil {

//    @GetMapping("/config")
//    String getConfigProperty();
//
//    @GetMapping("/name")
//    String getConfigName();
    @GetMapping
    List<Book> getAllBooks();
}
