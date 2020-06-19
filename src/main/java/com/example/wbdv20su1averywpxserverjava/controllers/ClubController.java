package com.example.wbdv20su1averywpxserverjava.controllers;

import com.example.wbdv20su1averywpxserverjava.models.Club;
import com.example.wbdv20su1averywpxserverjava.services.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ClubController {
    @Autowired
    ClubService service;
    public void createClub() {}
    public void deleteClub() {}
    public void updateClub() {}

    @GetMapping("/api/clubs")
    public List<Club> findAllClubs() {
        return service.findAllClubs();
    }

//    @GetMapping("/api/Clubs/{ClubId}")
//    public Club findClubById(
//            @PathVariable("ClubId") Integer tid) {
//        return service.findClubById(tid);
//    }
//
//    @GetMapping("/api/lessons/{lessonId}/Clubs")
//    public List<Club> findClubsForLesson(
//            @PathVariable("lessonId") String lessonId) {
//        return service.findClubsForLesson(lessonId);
//    }
}
