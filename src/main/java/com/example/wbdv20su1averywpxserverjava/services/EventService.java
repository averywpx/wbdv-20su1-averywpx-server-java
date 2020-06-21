package com.example.wbdv20su1averywpxserverjava.services;

import com.example.wbdv20su1averywpxserverjava.models.Club;
import com.example.wbdv20su1averywpxserverjava.models.Event;
import com.example.wbdv20su1averywpxserverjava.repositories.ClubRepository;
import com.example.wbdv20su1averywpxserverjava.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    @Autowired
    EventRepository repository;

    @Autowired
    ClubRepository clubRepository;

    List<Event> Events = new ArrayList<Event>();

    public List<Event> findAllEvents() {
        return repository.findAllEvents();
    }

    public List<Event> findEventsForClub(Integer cid) {
        return repository.findEventsForClub(cid);
    }

    public Event createEvent(Integer cid, Event newEvent) {
        Club club = clubRepository.findClubById(cid);
        newEvent.setClub(club);
        return repository.save(newEvent);
    }

    public List<Event> deleteEvent(Integer eid) {
        repository.deleteById(eid);
        List<Event> result = new ArrayList<Event>();
        return result;
    }
    
//    public Event findEventById(Integer wid) {
//        for (Event e: Events) {
//            if(e.getId().equals(wid)) {
//                return e;
//            }
//        }
//        return null;
//    }





//    public Event updateEvent(Integer EventId, Event updatedEvent) {
//        Event Event = repository.findEventById(EventId);
//        Event.setType(updatedEvent.getType());
//        repository.save(Event);
//        return Event;
//    }

}
