package com.example.cloth.store.services.servicesIMPL.addressServicesIMPL;

import com.example.cloth.store.models.addressModels.Street;

import com.example.cloth.store.repositories.addressRepo.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StreetServiceIMPL {
    @Autowired
    private StreetRepository streetRepository;

    public List<Street> getAllStreets() {
        return streetRepository.findAll();
    }

    public Street addStreet(Street country) {
        return streetRepository.save(country);
    }
}

