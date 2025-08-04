package com.example.demo.service;

import com.example.demo.entity.User;
import java.util.List;

public interface Userservice {
    User addUser(User user);
    List<User> getAllUsers();
    User getUserByName(String name);
    void deleteUser(Long id);
}
