package com.sivakarthik.WebProject.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sivakarthik.WebProject.model.User;
import com.sivakarthik.WebProject.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    public UserController() {
        userService = new UserService();

        userService.addUser("John", "Male", "/images/newImg.png");
        userService.addUser("Jane", "Female" , "/image/newImg2.png");
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
