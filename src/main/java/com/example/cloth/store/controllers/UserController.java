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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/api/user")
@AllArgsConstructor


public class UserController {

    private final UserServiceIMPL userService;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserRequest userRequest) {
        if (userRequest.getPasswordHash() == null || userRequest.getPasswordHash().isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
        try {
            logger.info("Received UserRequest: {}", userRequest);
            User user = UserMapper.mapToUser(userRequest);
            logger.info("Mapped User: {}", user);
            User savedUser = userService.save(user);
            logger.info("Saved User: {}", savedUser);
            return new ResponseEntity<>(savedUser, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error creating user", e);
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping({"/1"})
    ResponseEntity<String> hello() {
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }


}
