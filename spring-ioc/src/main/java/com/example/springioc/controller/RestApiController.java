package com.example.springioc.controller;

import com.example.springioc.annotation.Decode;
import com.example.springioc.annotation.Timer;
import com.example.springioc.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping("/get/{id}")
    public String get(@PathVariable long id, @RequestParam String name){
        System.out.println("get method");
        return id+ " " + name;

    }

    @PostMapping("/post")
    public User post(@RequestBody User user){
        return user;
    }

    @Timer
    @DeleteMapping("/delete")
    public void delete() throws InterruptedException {

        //db logic

        Thread.sleep(1000 * 2);
    }

    @Decode
    @PutMapping("/put")
    public User put(@RequestBody User user){
        System.out.print("put");
        System.out.print(user);
        return user;
    }

}
