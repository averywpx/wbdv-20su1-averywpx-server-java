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

    @PostMapping("/api/clubs/{clubId}/events")
    public Event createEvent(
            @PathVariable("clubId") Integer clubId,
            @RequestBody Event newEvent) {
        return service.createEvent(clubId, newEvent);
    }

    @DeleteMapping("/api/events/{eventId}")
    public List<Event> deleteEvent(
            @PathVariable("eventId") Integer eid) {
        return service.deleteEvent(eid);
    }


    @PutMapping("/api/events/{eid}")
    public Event updateEvent(
            @PathVariable("eid") Integer eventId,
            @RequestBody Event updatedEvent) {
        return service.updateEvent(eventId, updatedEvent);
    }
//
//    @PostMapping("/api/Events")
//    public Event createStandaloneEvent(
//            @RequestBody Event newEvent) {
//        return EventService.createEvent(1, newEvent);
//    }
//




//    @GetMapping("/api/Events/{EventId}")
//    public Event findEventById(
//            @PathVariable("EventId") Integer wid) {
//        return EventService.findEventById(wid);
//    }
//



}
