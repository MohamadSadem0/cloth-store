package com.example.cloth.store.services.services;

import com.example.cloth.store.models.Address;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    List<Address> findAll();

    Optional<Address> findById(Long id);

    Address save(Address address);

    void deleteById(Long id);
}
