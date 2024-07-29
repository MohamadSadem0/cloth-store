package com.example.cloth.store.services.services;

import com.example.cloth.store.models.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewService {
    List<Review> findAll();

    Optional<Review> findById(Long id);

    Review save(Review review);

    void deleteById(Long id);
}
