package com.example.hello;

import ObejctMapper.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("---------------");

        // Text JSON -> Object
        // Object -> Test JSON

        // controller req json(text) -> object
        // response object -> json(text)

        var ObjectMapper = new ObjectMapper();

        // object -> text
        // object mapper get method 를 활용
        var user = new User("daeyoung", 20, "010-1111-2222");
        var text = ObjectMapper.writeValueAsString(user);
        System.out.println(text);

        // Text -> object
        // object mapper는 defalut 생성자를 필요로 한다.
        // object mapper 이용시 get이 들어간 method가 있으면 에러가 날 수 있다.
        var objectUser = ObjectMapper.readValue(text, User.class);
        System.out.println(objectUser);

    }





}
