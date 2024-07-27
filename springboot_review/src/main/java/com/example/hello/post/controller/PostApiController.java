package com.example.hello.post.controller;


import com.example.hello.post.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public void post(@RequestBody Map<String, Object> requestData) {

        requestData.forEach((key, value) -> {
            System.out.println("Key :" + key);
            System.out.println("Value :" + value);
        });
    }

    @PostMapping("/post02")
    public void post(@RequestBody PostRequestDto postRequestDto) {

        System.out.println(postRequestDto);

    }

}
