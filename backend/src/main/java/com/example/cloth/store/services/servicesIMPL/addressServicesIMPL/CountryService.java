package com.example.cloth.store.services.servicesIMPL.addressServicesIMPL;

import com.example.cloth.store.models.addressModels.Country;
import com.example.cloth.store.repositories.addressRepo.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }
}

