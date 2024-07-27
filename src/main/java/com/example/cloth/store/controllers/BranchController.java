package com.example.cloth.store.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"api/Brand"})
public class BranchController {

    @GetMapping
    public ResponseEntity<String> helloworld(){
    return new ResponseEntity<String>("<h1>jwqhgeugeiqwi</h1>", HttpStatus.OK);
    }


}
