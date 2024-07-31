package com.example.cloth.store.services.servicesIMPL;

import com.example.cloth.store.models.Store;
import com.example.cloth.store.repositories.StoreRepository;
import com.example.cloth.store.services.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoreServiceIMPL implements StoreService {

    @Autowired
    private StoreRepository storeRepository;

    @Override
    public List<Store> findAll() {
        return storeRepository.findAll();
    }

    @Override
    public Optional<Store> findById(Long id) {
        return storeRepository.findById(id);
    }

    @Override
    public Store save(Store store) {
        return storeRepository.save(store);
    }

    @Override
    public void deleteById(Long id) {
        storeRepository.deleteById(id);
    }


}
