package com.login.exercise.repository;

import com.login.exercise.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository<T, ID> extends JpaRepository<User, Long> {

    User save(User user);

    Optional<User> findById(Long id);
}
