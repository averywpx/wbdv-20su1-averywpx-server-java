package com.example.wbdv20su1averywpxserverjava.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="clubs")
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String category;
    //president's username
    private String president;

    @OneToMany(mappedBy = "club")
    private List<Event> eventList;

    @ManyToMany(mappedBy="enrolledSections")
    @JsonIgnore
    private List<User> enrolledUsers;




    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }

    public List<Event> getEventList() {
        return eventList;
    }


    public Club(Integer id, String name, String category, List<Event> eventList) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.eventList = eventList;
    }



    public Club() {
    }

    public Club(Integer id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
