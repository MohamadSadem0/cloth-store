package com.example.cloth.store.controllers;

import com.example.cloth.store.models.addressModels.Country;
import com.example.cloth.store.services.servicesIMPL.addressServicesIMPL.CountryServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountryController {

    @Autowired
    private CountryServiceIMPL countryService;

    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return countryService.addCountry(country);
    }
}
