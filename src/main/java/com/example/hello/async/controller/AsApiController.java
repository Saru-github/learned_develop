package com.example.hello.async.controller;


import com.example.hello.async.service.AsyncService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/asapi")
public class AsApiController {

    private final AsyncService asyncService;

    public AsApiController(AsyncService asyncService){
        this.asyncService = asyncService;
    }

}
