package com.example.hogwarts.domain.model.entities;

import com.example.hogwarts.domain.model.enums.House;
import com.example.hogwarts.domain.model.enums.Role;

import javax.persistence.Entity;

@Entity
public class User {
    private String name;
    private String login;
    private String password;
    private Role role;
    private House house;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }


}
