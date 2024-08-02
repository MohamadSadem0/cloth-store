package com.example.cloth.store.services.services.addressServices;

import com.example.cloth.store.models.addressModels.Country;
import java.util.List;

public interface CountryService {
    List<Country> getAllCountries();
    Country addCountry(Country country);
}

