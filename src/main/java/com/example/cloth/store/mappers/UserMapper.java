package com.example.cloth.store.mappers;

import com.example.cloth.store.dto.UserRequest;
import com.example.cloth.store.dto.UserResponse;
import com.example.cloth.store.enums.AddressType;
import com.example.cloth.store.models.User;

import static com.example.cloth.store.enums.UserRole.CUSTOMER;

public class UserMapper {


    public static UserResponse mapToResponse(User user) {
        return UserResponse.builder().id(user.getId())
                .email(user.getEmail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .phoneNumber(user.getPhoneNumber())
                .username(user.getUsername())
                .shippingAddress(AddressMapper.mapToResponse(user.getShippingAddress())).build();
    }

    public static User mapToUser(UserRequest userRequest) {
        return User.builder().username(userRequest.getUsername())
                .email(userRequest.getEmail())
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getFirstName())
                .phoneNumber(userRequest.getPhoneNumber())
                .role(userRequest.getRole())
                .shippingAddress(AddressMapper.mapToAddress(userRequest.getShippingAddress(), userRequest.getRole() == CUSTOMER ? AddressType.SHIPPING : AddressType.BILLING)).
                build();

    }
}
