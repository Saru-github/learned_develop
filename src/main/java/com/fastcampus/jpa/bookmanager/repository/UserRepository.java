package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface UserRepository extends JpaRepository<User, Long> {
//    User findByName(String name);
//    Set<User>findByName(String name);
//    Optional<User> findByName(String name);
    // 리턴타입을 여러가지로 설정 할 수 있다.
    List<User> findByName(String name);
    User findByEmail(String email);
    User getByEmail(String email);
    User readByEmail(String email);
    User queryByEmail(String email);
    User searchByEmail(String email);
    User streamByEmail(String email);
    User findUserByEmail(String email);

    List<User> findTop1ByName(String name);
    List<User> findFirst1ByName(String name);

}
