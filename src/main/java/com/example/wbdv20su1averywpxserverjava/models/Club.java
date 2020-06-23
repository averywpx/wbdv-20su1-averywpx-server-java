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

    @ManyToMany(mappedBy = "clubs")
    @JsonIgnore
    private List<User> users;



    public Club() {
    }


    public Club(Integer id, String name, String category, String president, List<Event> eventList, List<User> users) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.president = president;
        this.eventList = eventList;
        this.users = users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }

    public List<Event> getEventList() {
        return eventList;
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

    public void setPresident(String president) {
        this.president = president;
    }

    public String getPresident() {
        return president;
    }
}
