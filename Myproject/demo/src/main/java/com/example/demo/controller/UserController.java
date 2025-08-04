package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController implements Userservice {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    @Override
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/list")
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{name}")
    @Override
    public User getUserByName(@PathVariable String name) {
        return userRepository.findByUserName(name);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}
