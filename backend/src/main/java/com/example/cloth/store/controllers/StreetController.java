package com.example.cloth.store.controllers;

import com.example.cloth.store.models.addressModels.Street;
import com.example.cloth.store.services.servicesIMPL.addressServicesIMPL.StreetServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/streets")
public class StreetController {

    @Autowired
    private StreetServiceIMPL streetService;

    @GetMapping
    public List<Street> getAllStreets() {
        return streetService.getAllStreets();
    }

    @PostMapping
    public Street addStreet(@RequestBody Street street) {
        return streetService.addStreet(street);
    }
}
