package com.example.hello.aop.controller;


import com.example.hello.aop.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api01")
public class RestApiController02 {


    @GetMapping("/get/{id}")
    public String get(@PathVariable Long id, @RequestParam String name){

        System.out.println("get method");
        System.out.println("get method:" + id);
        System.out.println("get method:" + name);

        return id + " " + name;

    }


    @PostMapping("/post")
    public User post(@RequestBody User user){

        System.out.println("post method: "+ user);
        return user;

    }
}
