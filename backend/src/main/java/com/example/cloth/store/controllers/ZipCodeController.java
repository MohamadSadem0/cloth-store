package com.example.cloth.store.controllers;

import com.example.cloth.store.models.addressModels.ZipCode;
import com.example.cloth.store.services.servicesIMPL.addressServicesIMPL.ZipCodeServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/zipcodes")
public class ZipCodeController {

    @Autowired
    private ZipCodeServiceIMPL zipCodeService;

    @GetMapping
    public List<ZipCode> getAllZipCodes() {
        return zipCodeService.getAllZipCodes();
    }

    @PostMapping
    public ZipCode addZipCode(@RequestBody ZipCode zipCode) {
        return zipCodeService.addZipCode(zipCode);
    }
}
