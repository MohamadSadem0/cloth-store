package com.example.cloth.store.repositories.addressRepo;

import com.example.cloth.store.models.addressModels.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {}

