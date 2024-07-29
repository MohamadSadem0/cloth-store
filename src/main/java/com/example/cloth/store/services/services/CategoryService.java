package com.example.cloth.store.services.services;

import com.example.cloth.store.models.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> findAll();

    Optional<Category> findById(Long id);

    Category save(Category branch);

    void deleteById(Long id);
}
