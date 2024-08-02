package com.example.cloth.store.services.services;

import com.example.cloth.store.models.Branch;

import java.util.List;
import java.util.Optional;

public interface BranchService {
    List<Branch> findAll();
    Optional<Branch> findById(Long id);
    Branch save(Branch branch);
    void deleteById(Long id);
}
