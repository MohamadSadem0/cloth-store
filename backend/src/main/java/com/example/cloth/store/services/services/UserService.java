package com.example.cloth.store.services.services;

import com.example.cloth.store.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();

    Optional<User> findById(Long id);

    Optional<User> findByName(String name);

    User save(User user);

//    String save(User user);

    void deleteById(Long id);
}