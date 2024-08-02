package com.example.cloth.store.services.servicesIMPL.addressServicesIMPL;

import com.example.cloth.store.models.addressModels.State;
import com.example.cloth.store.repositories.addressRepo.StateRepository;
import com.example.cloth.store.services.services.addressServices.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class StateServiceIMPL implements StateService {
    @Autowired
    private StateRepository stateRepository;

    public List<State> getAllStates() {
        return stateRepository.findAll();
    }

    public State addState(State state) {
        return stateRepository.save(state);
    }
}

// Similar services for State, ZipCode, and Street
