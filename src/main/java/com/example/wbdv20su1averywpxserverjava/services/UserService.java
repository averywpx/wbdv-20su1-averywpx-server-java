package com.example.wbdv20su1averywpxserverjava.services;


import com.example.wbdv20su1averywpxserverjava.models.Club;
import com.example.wbdv20su1averywpxserverjava.models.Event;
import com.example.wbdv20su1averywpxserverjava.models.User;
import com.example.wbdv20su1averywpxserverjava.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;


@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public List<User> findAllUsers() {
        return repository.findAllUsers();
    }


    public User createUser(User user) {
        return repository.save(user);
    }
    public User findUserById(Integer id) {
        return repository.findUserById(id);
    }

    public User findUserByCredentials(String username, String password) {
        return repository.findUserByCredentials(username, password);
    }

    public User findUserByUsername(String username) {
        return repository.findUserByUsername(username);
    }

    public User updateUser(Integer userId, User updatedUser) {
        User user = repository.findUserById(userId);
        user.setUsername(updatedUser.getUsername());
        user.setPassword(updatedUser.getPassword());
        user.setGender(updatedUser.getGender());
        user.setPhone(updatedUser.getPhone());
        user.setEmail(updatedUser.getEmail());
        repository.save(user);
        return user;
    }
}
