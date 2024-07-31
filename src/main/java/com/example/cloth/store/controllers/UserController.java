package com.example.cloth.store.controllers;


import com.example.cloth.store.services.servicesIMPL.AddressServiceIMPL;
import com.example.cloth.store.services.servicesIMPL.UserServiceIMPL;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor


public class UserController {

    private final UserServiceIMPL userService;
    private final AddressServiceIMPL addressService;

//    public ResponseEntity<>

//    @PostMapping
//    public User createUser(@RequestBody UserRequest userRequest){
//        Optional User user=userService.find
//
//    }


}
