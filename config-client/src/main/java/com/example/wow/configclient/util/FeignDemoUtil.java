package com.example.wow.configclient.util;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "feignDemo", url = "http://localhost:8081")
public interface FeignDemoUtil {

    @GetMapping("/config")
    String getConfigProperty();

    @GetMapping("/name")
    String getConfigName();
}
