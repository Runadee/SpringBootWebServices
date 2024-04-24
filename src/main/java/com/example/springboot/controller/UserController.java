package com.example.springboot.controller;


import com.example.springboot.entity.User;
import com.example.springboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {

    private UserService userService;

    // build create User REST API
    @PostMapping
    public ResponseEntity<User>  createUser(@RequestBody User user){
        User savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // build get user by id REST API
    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long userId){
         User user =  userService.getUserById(userId);
         return new ResponseEntity<>(user, HttpStatus.OK);
    }

    // build get all users REST API
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
          List<User> users = userService.getAllUsers();
          return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
