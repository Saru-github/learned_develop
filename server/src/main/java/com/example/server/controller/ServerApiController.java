package com.example.server.controller;


import com.example.server.dtd.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/server")
public class ServerApiController {

    @GetMapping("")
    public User hello(@RequestParam String name, @RequestParam int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }

    @PostMapping("/user/{userId}/name/{userName}")
    public User post(@RequestBody User user,
                     @PathVariable int userId,
                     @PathVariable String userName,
                     @RequestHeader("x-authorization") String authorization,
                     @RequestHeader("custom-header") String customHeader){
        log.info("userId: {}, userName: {}", userId, userName);
        log.info("client req: {}", user);
        log.info("x-authorization: {}", authorization);
        log.info("custom-header: {}", customHeader);

        return user;
    }


}
