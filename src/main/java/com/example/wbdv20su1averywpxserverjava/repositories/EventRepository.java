package com.example.wbdv20su1averywpxserverjava.repositories;

import com.example.wbdv20su1averywpxserverjava.models.Club;
import com.example.wbdv20su1averywpxserverjava.models.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EventRepository extends CrudRepository<Event, Integer> {

    @Query("SELECT event FROM Event event")
    public List<Event> findAllEvents();


    @Query("SELECT event FROM Event event WHERE event.club.id=:clubid")
    public List<Event> findEventsForClub(
            @Param("clubid") Integer clubId);

//    @Query("SELECT Event FROM Event event WHERE Event.id=:eventid")
//    public Event findEventById(
//            @Param("eventid") Integer EventId);
}
