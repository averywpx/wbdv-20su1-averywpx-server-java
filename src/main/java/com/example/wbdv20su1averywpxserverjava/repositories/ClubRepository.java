package com.example.wbdv20su1averywpxserverjava.repositories;

import com.example.wbdv20su1averywpxserverjava.models.Club;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClubRepository extends CrudRepository<Club, Integer> {

    @Query("SELECT club FROM Club club")
    public List<Club> findAllClubs();

}
