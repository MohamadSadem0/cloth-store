package com.example.cloth.store.services.servicesIMPL;

import com.example.cloth.store.models.Address;
import com.example.cloth.store.repositories.AddressRepository;
import com.example.cloth.store.services.services.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class AddressServiceIMPL implements AddressService {

    private final AddressRepository addressRepository;
    @Override
    public List<Address> findAll() {
        return null;
    }

    @Override
    public Optional<Address> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Address save(Address address) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
