package com.example.cloth.store.services.services;

import com.example.cloth.store.models.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<Order> findAll();

    Optional<Order> findById(Long id);

    Order save(Order branch);

    void deleteById(Long id);
}
