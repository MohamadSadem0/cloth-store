package com.example.cloth.store.dto;

import com.example.cloth.store.models.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AddressRequest {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private Address.AddressType addressType;

    public enum AddressType {
        SHIPPING, BILLING
    }
}


