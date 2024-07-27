package com.example.cloth.store.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"api/Brand"})
public class BranchController {

    @GetMapping
    public ResponseEntity<String> helloworld(){
    return new ResponseEntity<String>("hello from first controller", HttpStatus.OK);
    }
}
