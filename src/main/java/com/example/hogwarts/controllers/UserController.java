package com.example.hogwarts.controllers;

import com.example.hogwarts.application.services.interfaces.UserService;
import com.example.hogwarts.domain.model.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseEntity addUser(User user) {
        if (userService.getByLogin(user.getLogin()).isPresent())
            return new ResponseEntity<String>("User with this login already exists", HttpStatus.BAD_REQUEST);


        userService.save(user);

        return ResponseEntity.ok("");
    }

    @GetMapping("/all")
    public ResponseEntity getUsers() {
        return ResponseEntity.ok(userService.all());
    }
}
