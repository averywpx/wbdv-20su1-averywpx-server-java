package com.example.wbdv20su1averywpxserverjava.services;


import com.example.wbdv20su1averywpxserverjava.models.Club;
import com.example.wbdv20su1averywpxserverjava.models.Event;
import com.example.wbdv20su1averywpxserverjava.models.Film;
import com.example.wbdv20su1averywpxserverjava.models.User;
import com.example.wbdv20su1averywpxserverjava.repositories.ClubRepository;
import com.example.wbdv20su1averywpxserverjava.repositories.EventRepository;
import com.example.wbdv20su1averywpxserverjava.repositories.FilmRepository;
import com.example.wbdv20su1averywpxserverjava.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmService {

    @Autowired
    FilmRepository repository;

    @Autowired
    UserRepository userRepository;

    List<Film> films = new ArrayList<Film>();

    public List<Film> findAllFilms() {
        return repository.findAllFilms();
    }

    public List<Film> findFilmsForUser(Integer uid) {
        return repository.findFilmsForUser(uid);
    }

    public Film createFilm(Integer uid, Film newFilm) {
        User user = userRepository.findUserById(uid);
        newFilm.setUser(user);
        return repository.save(newFilm);
    }

    public List<Film> deleteFilm(Integer fid) {
        repository.deleteById(fid);
        List<Film> result = new ArrayList<Film>();
        return result;
    }
}
