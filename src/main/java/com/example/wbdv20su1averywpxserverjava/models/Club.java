package com.example.wbdv20su1averywpxserverjava.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="clubs")
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String Category;

    @OneToMany(mappedBy = "club")
    private List<Event> eventList;

    public Club() {
    }

    public Club(Integer id, String name, String category) {
        this.id = id;
        this.name = name;
        Category = category;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return Category;
    }
}
