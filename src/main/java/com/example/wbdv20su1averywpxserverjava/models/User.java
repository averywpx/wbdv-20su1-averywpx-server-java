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

    @ManyToMany
    @JoinTable(name="ENROLLMENT",
            joinColumns=@JoinColumn(name="STUDENT_ID",
                    referencedColumnName="ID"),
            inverseJoinColumns=@JoinColumn(name=
                    "SECTION_ID", referencedColumnName="ID"))
    @JsonIgnore
    private List<Club> enrolledClubs;


}
