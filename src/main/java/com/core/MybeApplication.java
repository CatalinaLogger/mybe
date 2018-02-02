package com.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MybeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybeApplication.class, args);
    }

    @RequestMapping("/goHome")
    @ResponseBody
    public String goHome(){
        return "hello word";
    }
}