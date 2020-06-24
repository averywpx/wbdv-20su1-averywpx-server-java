package com.example.wbdv20su1averywpxserverjava.controllers;


import com.example.wbdv20su1averywpxserverjava.models.Event;
import com.example.wbdv20su1averywpxserverjava.models.Film;
import com.example.wbdv20su1averywpxserverjava.services.EventService;
import com.example.wbdv20su1averywpxserverjava.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class FilmController {

    @Autowired
    FilmService service;

    @GetMapping("/api/films")
    public List<Film> findAllFilms() {
        return service.findAllFilms();
    }
    
    @GetMapping("/api/users/{userId}/films")
    public List<Film> findFilmsForUser(
            @PathVariable("userId") Integer uid) {
        return service.findFilmsForUser(uid);
    }

    @PostMapping("/api/users/{userId}/films")
    public Film createFilm(
            @PathVariable("userId") Integer userId,
            @RequestBody Film newFilm) {
        return service.createFilm(userId, newFilm);
    }

    @DeleteMapping("/api/films/{filmId}")
    public List<Film> deleteFilm(
            @PathVariable("filmId") Integer fid) {
        return service.deleteFilm(fid);
    }
    
    
    
    
}
