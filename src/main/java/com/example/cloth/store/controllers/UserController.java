package com.example.cloth.store.controllers;


import com.example.cloth.store.dto.UserRequest;
import com.example.cloth.store.mappers.UserMapper;
import com.example.cloth.store.models.User;
import com.example.cloth.store.services.servicesIMPL.AddressServiceIMPL;
import com.example.cloth.store.services.servicesIMPL.UserServiceIMPL;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor


public class UserController {

    private final UserServiceIMPL userService;
    private final AddressServiceIMPL addressService;


//    @PostMapping
//    public User createUser(@RequestBody UserRequest userRequest) {
//
//
//        return userService.save(UserMapper.mapToUser(userRequest));
//    }

    @PostMapping
    ResponseEntity<User> createUser(@RequestBody UserRequest userRequest) {
        return new ResponseEntity<>(userService.save(UserMapper.mapToUser(userRequest)), HttpStatus.OK);
    }

    @GetMapping({"/1"})
    ResponseEntity<String> hello() {
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }


}
