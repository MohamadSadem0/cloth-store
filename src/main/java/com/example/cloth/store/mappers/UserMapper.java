package com.example.cloth.store.mappers;

import com.example.cloth.store.dto.UserResponse;
import com.example.cloth.store.models.User;

public class UserMapper {


    public static UserResponse mapToResponse(User user){
        return UserResponse.builder().id(user.getId())
                .email(user.getEmail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .phoneNumber(user.getPhoneNumber())
                .username(user.getUsername())
                .shippingAddress(user.getShippingAddress())


    }
}
