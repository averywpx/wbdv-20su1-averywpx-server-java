package com.example.wbdv20su1averywpxserverjava.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String time;
    private String location;
    private String content;



    @ManyToOne
    @JsonIgnore
    private Club club;

    public Event() {
    }

    public Event(Integer id, String time, String location, String content, Club club) {
        this.id = id;
        this.time = time;
        this.location = location;
        this.content = content;
        this.club = club;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Integer getId() {
        return id;
    }

    public String getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }

    public String getContent() {
        return content;
    }

    public Club getClub() {
        return club;
    }
}
