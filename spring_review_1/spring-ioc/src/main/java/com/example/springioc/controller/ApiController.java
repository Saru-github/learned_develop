package com.example.springioc.controller;

import com.example.springioc.dto.User1;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @PostMapping("/user1")
    public Object user(User1 user1){
        System.out.println(user1);
        return user1;
    }

}
