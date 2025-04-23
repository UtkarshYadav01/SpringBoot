package com.ucode.controllers;

import com.ucode.entities.User;
import com.ucode.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User addUserDetails(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/user")
    public List<User> getAllUserDetails() {
        return userService.getAllUser();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserDetails(@PathVariable int id) {
        User user = userService.getUserDetails(id).orElse(null);
        if (user != null) {
            return ResponseEntity.ok().body(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUserDetails(@PathVariable int id, @RequestBody User user) {
        User updatedUser = userService.updateUserDetails(id, user);
        if (updatedUser != null) {
            //return ResponseEntity.ok().body(user);both are same
            return ResponseEntity.ok(updatedUser);//both are same
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    //to print a message output
    /*@DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        String message = "User with ID " + id + " deleted successfully.";
        return ResponseEntity.ok(message);
    }*/
}
