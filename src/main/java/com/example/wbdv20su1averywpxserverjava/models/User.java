package com.example.wbdv20su1averywpxserverjava.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String gender;

    public User(Integer id, String username, String password, String phone, String email, String gender, List<Film> movieList, List<Club> clubs) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.movieList = movieList;
        this.clubs = clubs;
    }

    @OneToMany(mappedBy = "user")
    private List<Film> movieList;

    @ManyToMany
    @JoinTable(
            name="enrollments",
            joinColumns=@JoinColumn(name="USER_ID", referencedColumnName="ID"),
            inverseJoinColumns=@JoinColumn(name="CLUB_ID", referencedColumnName="ID"))
    private List<Club> clubs;

    public List<Film> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Film> movieList) {
        this.movieList = movieList;
    }

    public User(Integer id, String username, String password, String phone, String email, String gender, List<Club> clubs) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.clubs = clubs;
    }

    public User() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setClubs(List<Club> clubs) {
        this.clubs = clubs;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public List<Club> getClubs() {
        return clubs;
    }
}
