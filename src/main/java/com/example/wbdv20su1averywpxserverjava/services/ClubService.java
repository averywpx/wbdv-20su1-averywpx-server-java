package com.example.wbdv20su1averywpxserverjava.services;

import com.example.wbdv20su1averywpxserverjava.models.Club;
import com.example.wbdv20su1averywpxserverjava.repositories.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClubService {
    @Autowired
    ClubRepository repository;

    List<Club> Clubs = new ArrayList<Club>();

    public List<Club> findAllClubs() {
        return repository.findAllClubs();
    }

}
