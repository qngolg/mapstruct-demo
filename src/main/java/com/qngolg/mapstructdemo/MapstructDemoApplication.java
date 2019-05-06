package com.qngolg.mapstructdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MapstructDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapstructDemoApplication.class, args);
    }

    @GetMapping("/test/aaa/aaa")
    public String test(){
        String value = null;
        System.out.println("aaaaaaaaaaaaa");
        return null;
    }
}
