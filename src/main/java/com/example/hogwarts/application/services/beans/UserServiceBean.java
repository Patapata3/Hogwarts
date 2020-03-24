package com.example.hogwarts.application.services.beans;

import com.example.hogwarts.application.repos.UserRepo;
import com.example.hogwarts.application.services.interfaces.UserService;
import com.example.hogwarts.domain.model.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceBean implements UserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public void save(User user) {
        userRepo.saveAndFlush(user);
    }

    @Override
    public Optional<User> getById(Long id) {
        return userRepo.findById(id);
    }

    @Override
    public User getByLogin(String login) {
        return userRepo.findByLogin(login);
    }

    @Override
    public List<User> all() {
        return userRepo.findAll();
    }

}
