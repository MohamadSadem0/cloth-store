package com.example.cloth.store.dto;

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
//    private AddressType addressType;


}


