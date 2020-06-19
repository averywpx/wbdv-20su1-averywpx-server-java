package com.example.wbdv20su1averywpxserverjava.controllers;

import com.example.wbdv20su1averywpxserverjava.models.Event;
import com.example.wbdv20su1averywpxserverjava.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class EventController {

    /*
    CRUD
    C - Create
    R - Read
    U - Update
    D - Delete
     */

    @Autowired
    EventService service;

    @GetMapping("/api/events")
    public List<Event> findAllEvents() {
        return service.findAllEvents();
    }

    @GetMapping("/api/clubs/{clubId}/events")
    public List<Event> findEventsForClub(
            @PathVariable("clubId") Integer tid) {
        return service.findEventsForClub(tid);
    }

//
//    @PutMapping("/api/Events/{wid}")
//    public Event updateEvent(
//            @PathVariable("wid") Integer EventId,
//            @RequestBody Event updatedEvent) {
//        return EventService.updateEvent(EventId, updatedEvent);
//    }
//
//    @PostMapping("/api/Events")
//    public Event createStandaloneEvent(
//            @RequestBody Event newEvent) {
//        return EventService.createEvent(1, newEvent);
//    }
//
//    @PostMapping("/api/Clubs/{tid}/Events")
//    public Event createEvent(
//            @PathVariable("tid") Integer ClubId,
//            @RequestBody Event newEvent) {
//        return EventService.createEvent(ClubId, newEvent);
//    }



//    @GetMapping("/api/Events/{EventId}")
//    public Event findEventById(
//            @PathVariable("EventId") Integer wid) {
//        return EventService.findEventById(wid);
//    }
//
//    @DeleteMapping("/api/Events/{EventId}")
//    public List<Event> deleteEvent(
//            @PathVariable("EventId") Integer wid) {
//        return EventService.deleteEvent(wid);
//    }


}
