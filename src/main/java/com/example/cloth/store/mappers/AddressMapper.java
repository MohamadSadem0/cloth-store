package com.example.cloth.store.mappers;

import com.example.cloth.store.dto.AddressRequest;
import com.example.cloth.store.models.Address;

public class AddressMapper {
    public static Address mapToAddress(AddressRequest addressRequest) {
        return Address.builder().id(addressRequest.getId)
    }
}
