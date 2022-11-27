package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.contains;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud(){
//        List<User>users = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
//        users.forEach(System.out::println);
//
//        users = userRepository.findAllById(Lists.newArrayList(1L,3L,5L));
//        users.forEach(System.out::println);
//        User user1 = new User("jack", "jack@naver.com");
//        User user2 = new User("steve", "steve@naver.com");
//        userRepository.saveAll(Lists.newArrayList(user1, user2));
//        List<User> users = userRepository.findAll();
//        users.forEach(System.out::println);
//        User user = userRepository.getOne(1L);
//        User user1 = userRepository.findById(1L).orElse(null);
//        System.out.println(user1);
//        userRepository.saveAndFlush(new User("new martin", "newma@gmail.com"));
//        userRepository.findAll().forEach(System.out::println);
//        long count = userRepository.count();
//        System.out.println(count);
//        boolean exists = userRepository.existsById(1L);
//        System.out.println(exists);
//        userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));
//        userRepository.deleteAll(userRepository.findAllById(Lists.newArrayList(1L,3L)));
//        userRepository.findAll().forEach(System.out::println);
//        userRepository.deleteAllInBatch();
//        userRepository.findAll().forEach(System.out::println);
//        Page<User> users = userRepository.findAll(PageRequest.of(1,3));
//        System.out.println("page: "+ users);
//        System.out.println("totalElemetns: " + users.getTotalElements());
//        System.out.println("totalPages: " + users.getTotalPages());
//        System.out.println("numberOfElements: " + users.getNumberOfElements());
//        System.out.println("sort: " + users.getSort());
//        System.out.println("size: " + users.getSize());
//        ExampleMatcher matcher = ExampleMatcher.matching()
//                .withIgnorePaths("name")
//                .withMatcher("email", endsWith());
//        Example<User> example = Example.of(new User("ma", "gmail.com"), matcher);
//        userRepository.findAll(example).forEach(System.out::println);
//        User user = new User();
//        user.setEmail("gmail");
//        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("email", contains());
//        Example<User> example = Example.of(user, matcher);
//        userRepository.findAll(example).forEach(System.out::println);
//        userRepository.save(new User("david", "david@gmail.com"));

//        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
//        user.setEmail("martin-update@gmail.com");
//        userRepository.save(user);

    }

    @Test
    void select(){
//        System.out.println(userRepository.findByName("dy"));
//        System.out.println("findByEmail: "+ userRepository.findByEmail("glglanother@gmail.com"));
//        System.out.println("getByEmail: "+ userRepository.getByEmail("glglanother@gmail.com"));
//        System.out.println("readByEmail: "+ userRepository.readByEmail("glglanother@gmail.com"));
//        System.out.println("queryByEmail: "+ userRepository.queryByEmail("glglanother@gmail.com"));
//        System.out.println("searchByEmail: "+ userRepository.searchByEmail("glglanother@gmail.com"));
//        System.out.println("streamByEmail: "+ userRepository.streamByEmail("glglanother@gmail.com"));
//        System.out.println("findUserByEmail: "+ userRepository.findUserByEmail("glglanother@gmail.com"));
//        System.out.println("findTop1ByName: "+ userRepository.findTop1ByName("glglanother@gmail.com"));
//        System.out.println("findFirst1ByName: "+ userRepository.findFirst1ByName("glglanother@gmail.com"));
//        System.out.println("findFirst2ByName: "+ userRepository.findFirst2ByName("glglanother@gmail.com"));
//        System.out.println("findByEmailAndName: "+ userRepository.findByEmailAndName("glgl@gmail.com","martin"));
//        System.out.println("findByEmailOrName: "+ userRepository.findByEmailOrName("glgl@gmail.com","martin"));
//        System.out.println("findByEmailOrName: "+ userRepository.findByCreatedAtAfter(LocalDateTime.now().minusDays(1L)));
//        System.out.println("findByEmailOrName: "+ userRepository.findByIdAfter(4L));
//        System.out.println("findByEmailOrName: "+ userRepository.findByCreatedAtGreaterThan(LocalDateTime.now().minusDays(1L)));
//        System.out.println("findByCreatedAtGreaterThanEqual: "+ userRepository.findByCreatedAtGreaterThanEqual(LocalDateTime.now().minusDays(1L)));
//        System.out.println("findByCreatedAtBetween: "+ userRepository.findByCreatedAtBetween(LocalDateTime.now().minusDays(1L), LocalDateTime.now().plusDays(1L)));
//        System.out.println("findByIdBetween: "+ userRepository.findByIdBetween(2L, 4L));
//        System.out.println("findByIdIsNotNull: "+ userRepository.findByIdIsNotNull());
//        System.out.println("findByNameIn: "+ userRepository.findByNameIn(Lists.newArrayList("martin","dennis")));
//        System.out.println("findByNameStartingWith: "+ userRepository.findByNameStartingWith("mar"));
//        System.out.println("findByNameEndingWith: "+ userRepository.findByNameEndingWith("tin"));
//        System.out.println("findByNameContains: "+ userRepository.findByNameContains("art"));
//        System.out.println("findByNameLike: "+ userRepository.findByNameLike("%art%"));
        System.out.println("findUserByName: "+ userRepository.findUserByName("martin"));
        System.out.println("findUserByNameIs: "+ userRepository.findUserByNameIs("martin"));
        System.out.println("findUserByNameEquals: "+ userRepository.findUserByNameEquals("martin"));


    }

}