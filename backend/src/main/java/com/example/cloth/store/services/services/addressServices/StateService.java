package com.example.cloth.store.services.services.addressServices;

import com.example.cloth.store.models.addressModels.State;

import java.util.List;

public interface StateService {
    List<State> getAllStates();
    State addState(State state);
}
