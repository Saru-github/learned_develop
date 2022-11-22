package com.fastcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test() {

        User user = new User();
        user.setName("dy");
        user.setEmail("dy@gmail.com");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        User user1 = new User(null,"dy", "dy@gmail.com", LocalDateTime.now(), LocalDateTime.now());
        User user2 = new User("dy", "dy@gmail.com");

        User.builder().name("dy").email("dy@gmail.com").build();

        System.out.println(">>>>>>>"+user.toString());

    }

}