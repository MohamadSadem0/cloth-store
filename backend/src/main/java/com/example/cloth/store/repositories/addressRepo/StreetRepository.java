package com.example.cloth.store.repositories.addressRepo;

import com.example.cloth.store.models.addressModels.Street;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreetRepository extends JpaRepository<Street, Long> {}
