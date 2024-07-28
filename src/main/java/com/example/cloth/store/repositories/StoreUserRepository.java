package com.example.cloth.store.repositories;

import com.example.cloth.store.models.StoreUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreUserRepository extends JpaRepository<StoreUser, Long> {
}