package com.example.CRUD.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public String getAllUsers() {
        return "This will return all users in the future";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable int id) {
        return "This will return user with id " + id + " in the future";
    }

    @PostMapping
    public String createUser() {
        return "This will create a new user in the future";
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable int id) {
        return "This will update user with id " + id + " in the future";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        return "This will delete user with id " + id + " in the future";
    }

    @GetMapping("/greet")
    public String greetUser(@RequestParam String username) {
        return "Hello, " + username + "!";
    }
}
