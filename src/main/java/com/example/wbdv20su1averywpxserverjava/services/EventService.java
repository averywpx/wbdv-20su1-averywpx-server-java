package com.example.wbdv20su1averywpxserverjava.services;

import com.example.wbdv20su1averywpxserverjava.models.Event;
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

    List<Event> Events = new ArrayList<Event>();

    public List<Event> findAllEvents() {
        return repository.findAllEvents();
    }

    public List<Event> findEventsForClub(Integer tid) {
        return repository.findEventsForClub(tid);
    }
    
    
//    public Event findEventById(Integer wid) {
//        for (Event e: Events) {
//            if(e.getId().equals(wid)) {
//                return e;
//            }
//        }
//        return null;
//    }

//    public List<Event> deleteEvent(Integer wid) {
//        repository.deleteById(wid);
//        List<Event> result = new ArrayList<Event>();
//        return result;
//    }

//    public Event createEvent(Integer tid, Event newEvent) {
//        Club Club = ClubRepository.findClubById(tid);
//        newEvent.setClub(Club);
//        return repository.save(newEvent);
//    }

//    public Event updateEvent(Integer EventId, Event updatedEvent) {
//        Event Event = repository.findEventById(EventId);
//        Event.setType(updatedEvent.getType());
//        repository.save(Event);
//        return Event;
//    }

}
