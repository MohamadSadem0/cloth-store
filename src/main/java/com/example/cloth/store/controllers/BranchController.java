package com.example.cloth.store.controllers;

import com.example.cloth.store.models.Branch;
import com.example.cloth.store.services.servicesIMPL.BranchServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/branches")
public class BranchController {

    @Autowired
    private BranchServiceIMPL branchService;

    @GetMapping
    public List<Branch> getAllBranches() {
        return branchService.findAll();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Branch> getBranchById(@PathVariable Long id) {
        Optional<Branch> branch = branchService.findById(id);
        return branch.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

    }

    @PostMapping
    public Branch createBranch(@RequestBody Branch branch) {
        return branchService.save(branch);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Branch> updateBranch(@PathVariable Long id, @RequestBody Branch branchDetails) {
        Optional<Branch> optionalBranch = branchService.findById(id);
        if (optionalBranch.isPresent()) {
            Branch branch = optionalBranch.get();
            branch.setName(branchDetails.getName());
            branch.setStore(branchDetails.getStore());
            Branch updatedBranch = branchService.save(branch);
            return ResponseEntity.ok(updatedBranch);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBranch(@PathVariable Long id) {
        branchService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
