package com.example.wbdv20su1averywpxserverjava.controllers;

import com.example.wbdv20su1averywpxserverjava.models.Club;
import com.example.wbdv20su1averywpxserverjava.models.Event;
import com.example.wbdv20su1averywpxserverjava.services.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ClubController {
    @Autowired
    ClubService service;

    @GetMapping("/api/clubs")
    public List<Club> findAllClubs() {
        return service.findAllClubs();
    }

    @GetMapping("/api/clubs/{clubId}")
    public Club findClubById(
            @PathVariable("clubId") Integer cid) {
        return service.findClubById(cid);
    }
    
    @PostMapping("/api/clubs")
    public Club createStandaloneClub(
            @RequestBody Club newClub) {
        return service.createClub(newClub);
    }

    @DeleteMapping("/api/clubs/{clubId}")
    public List<Club> deleteClub(
            @PathVariable("clubId") Integer cid) {
        return service.deleteClub(cid);
    }

    @PutMapping("/api/clubs/{cid}")
    public Club updateClub(
            @PathVariable("cid") Integer clubId,
            @RequestBody Club updatedClub) {
        return service.updateClub(clubId, updatedClub);
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
