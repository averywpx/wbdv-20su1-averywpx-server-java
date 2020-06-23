package com.example.wbdv20su1averywpxserverjava.controllers;

import com.example.wbdv20su1averywpxserverjava.models.Club;
import com.example.wbdv20su1averywpxserverjava.models.Event;
import com.example.wbdv20su1averywpxserverjava.models.User;
import com.example.wbdv20su1averywpxserverjava.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@CrossOrigin(
        origins = "http://localhost:3000",
        allowCredentials = "true")
public class UserController {
    @Autowired
    UserService service;


    @GetMapping("/api/users")
    public List<User> findAllUsers() {
        return service.findAllUsers();
    }

    @PostMapping("/api/register")
    public User register(
            @RequestBody User user,
            HttpSession session) {
        User existingUser = service.findUserByUsername(user.getUsername());
        if(existingUser == null) {
            User currentUser = service.createUser(user);
            session.setAttribute("currentUser", currentUser);
            return currentUser;
        }
        return null;
    }

    @PostMapping("/api/profile")
    public User profile(HttpSession session) {
        User currentUser = (User)session.getAttribute("currentUser");
        session.setAttribute("currentUser", currentUser);
        return currentUser;
    }

    @PostMapping("/api/login")
    public User login(
            @RequestBody User user,
            HttpSession session) {
        User currentUser = service.findUserByCredentials(user.getUsername(), user.getPassword());
        session.setAttribute("currentUser", currentUser);
        return currentUser;
    }

    @PostMapping("/api/logout")
    public void logout(HttpSession session) {
        session.invalidate();
    }

    @PutMapping("/api/users/{userId}")
    public User updateUser(
            @PathVariable("userId") Integer userId,
            @RequestBody User updatedUser) {
        return service.updateUser(userId, updatedUser);
    }
}
