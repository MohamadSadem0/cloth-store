package com.example.cloth.store.services.servicesIMPL;

import com.example.cloth.store.models.Branch;
import com.example.cloth.store.repositories.BranchRepository;
import com.example.cloth.store.services.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BranchServiceIMPL implements BranchService {

    @Autowired
    private BranchRepository branchRepository;

    @Override
    public List<Branch> findAll() {
        return branchRepository.findAll();
    }

    @Override
    public Optional<Branch> findById(Long id) {
        return branchRepository.findById(id);
    }

    @Override
    public Branch save(Branch branch) {
        return branchRepository.save(branch);
    }

    @Override
    public void deleteById(Long id) {
        branchRepository.deleteById(id);
    }
}
