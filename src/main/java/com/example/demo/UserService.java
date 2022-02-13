package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {


    private List<User> users;

    public UserService() {
        users = new ArrayList<>(List.of(new User(0l, "Toto", "noreply@toto"), new User(1l, "titi", "noreply@titi.fr")));
    }

    public List<User> getUsers() {
        return users;
    }


    public void addUser(User user) {
        users.add(user);
    }
}
