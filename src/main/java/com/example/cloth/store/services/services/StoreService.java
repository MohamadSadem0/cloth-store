package com.example.cloth.store.services.services;

import com.example.cloth.store.models.Store;

import java.util.List;
import java.util.Optional;

public interface StoreService {
    List<Store> findAll();
    Optional<Store> findById(Long id);
    Store save(Store store);
    void deleteById(Long id);
}
