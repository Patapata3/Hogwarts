package com.example.hogwarts.application.services.interfaces;

import com.example.hogwarts.domain.model.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void save(User user);
    Optional<User> getById(Long id);
    Optional<User> getByLogin(String login);
    List<User> all();
}
