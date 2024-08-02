package com.example.cloth.store.services.services;

import com.example.cloth.store.models.StoreUser;

import java.util.List;
import java.util.Optional;

public interface StoreUserService {
    List<StoreUser> findAll();

    Optional<StoreUser> findById(Long id);

    StoreUser save(StoreUser storeUser);

    void deleteById(Long id);
}