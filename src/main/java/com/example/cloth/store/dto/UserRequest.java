package com.example.cloth.store.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private String username;
    private String email;
    private String password;
    private UserRole role;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private AddressRequest shippingAddress;

    public enum UserRole {
        CUSTOMER, STORE_OWNER, ADMIN, EMPLOYEE
    }
}
