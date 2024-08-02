package com.example.cloth.store.repositories.addressRepo;


import com.example.cloth.store.models.addressModels.ZipCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZipCodeRepository extends JpaRepository<ZipCode, Long> {}

