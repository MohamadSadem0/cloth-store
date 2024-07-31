package com.example.cloth.store.mappers;

import com.example.cloth.store.dto.AddressRequest;
import com.example.cloth.store.enums.AddressType;
import com.example.cloth.store.models.Address;

public class AddressMapper {
    public static Address mapToAddress(AddressRequest addressRequest, AddressType addressType) {
        return Address.builder().city(addressRequest.getCity())
                .street(addressRequest.getStreet())
                .state(addressRequest.getState())
                .zipCode(addressRequest.getZipCode())
                .country(addressRequest.getCountry())
                .addressType(addressType)
                .build();

    }

    public static String mapToResponse(Address address) {
        return address.getCity() + address.getAddressType();
    }
}
