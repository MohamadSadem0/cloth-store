package com.example.cloth.store.services.servicesIMPL.addressServicesIMPL;

import com.example.cloth.store.models.addressModels.ZipCode;
import com.example.cloth.store.repositories.addressRepo.ZipCodeRepository;
import com.example.cloth.store.services.services.addressServices.ZipCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZipCodeServiceIMPL implements ZipCodeService {
    @Autowired
    private ZipCodeRepository zipCodeRepository;

    @Override
    public List<ZipCode> getAllZipCodes() {
        return zipCodeRepository.findAll();
    }

    @Override
    public ZipCode addZipCode(ZipCode zipCode) {
        return zipCodeRepository.save(zipCode);
    }
}
