package com.example.cloth.store.dto;

import com.example.cloth.store.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private String passwordHash;
    private String lastName;
    private String phoneNumber;
    private AddressRequest shippingAddress;

//    public enum UserRole {
//        CUSTOMER, STORE_OWNER, ADMIN, EMPLOYEE
//    }
}
