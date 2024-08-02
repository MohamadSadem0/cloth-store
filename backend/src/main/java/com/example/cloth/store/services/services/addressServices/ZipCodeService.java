package com.example.cloth.store.services.services.addressServices;

import com.example.cloth.store.models.addressModels.ZipCode;

import java.util.List;

public interface ZipCodeService {
    List<ZipCode> getAllZipCodes();
    ZipCode addZipCode(ZipCode zipCode);
}
