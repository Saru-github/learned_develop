package com.example.hello.controller;


import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello") // http://localhost:8080/api/get/hello
    public String hello(){
        return "get Hello";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET) // get http://localhost:8080/api/get/hello
    public String hi(){
        return "hi";
    }

    // http://localhost:8080/api/get/path-variable/{spring-boot}
    // http://localhost:8080/api/get/path-variable/{main}

    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name="name") String pathName){
        System.out.println("PathVariable :" + pathName);
        return pathName;
    }

    // ? key=value&key2=value2
    // http://localhost:8080/api/get/query-param?user=steve&email=steve@gmail.com&age=30
    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");

        });
        return sb.toString();
    }

    @GetMapping("query-param02")
    public String queryParam02(
        @RequestParam String name,
        @RequestParam String email,
        @RequestParam int age){

        System.out.print(name);
        System.out.print(email);
        System.out.print(age);

        return name + " " + email + " " + age;

    }

    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest){

        System.out.print(userRequest.getName());
        System.out.print(userRequest.getEmail());
        System.out.print(userRequest.getAge());

        return userRequest.toString();

    }

}
