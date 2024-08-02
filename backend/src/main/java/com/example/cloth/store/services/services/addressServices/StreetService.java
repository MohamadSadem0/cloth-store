package com.example.cloth.store.services.services.addressServices;

import com.example.cloth.store.models.addressModels.Street;

import java.util.List;

public interface StreetService {
    List<Street> getAllStreets();
    Street addStreet(Street street);
}
