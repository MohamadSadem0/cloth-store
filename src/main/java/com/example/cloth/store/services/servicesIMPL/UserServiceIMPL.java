package com.example.cloth.store.services.servicesIMPL;

import com.example.cloth.store.models.User;
import com.example.cloth.store.repositories.UserRepository;
import com.example.cloth.store.services.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserServiceIMPL implements UserService {

//    @Autowired
    private final UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        User user=userRepository.findById(id).orElseThrow(()->new IllegalArgumentException("User not found"));
        return
    }

    @Override
    public Optional<User> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
