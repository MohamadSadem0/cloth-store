package com.example.cloth.store.controllers;

import com.example.cloth.store.models.addressModels.State;
import com.example.cloth.store.services.servicesIMPL.addressServicesIMPL.StateServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/states")
public class StateController {

    @Autowired
    private StateServiceIMPL stateService;

    @GetMapping
    public List<State> getAllStates() {
        return stateService.getAllStates();
    }

    @PostMapping
    public State addState(@RequestBody State state) {
        return stateService.addState(state);
    }
}
