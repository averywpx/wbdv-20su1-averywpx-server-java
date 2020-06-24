package com.example.wbdv20su1averywpxserverjava.repositories;

import com.example.wbdv20su1averywpxserverjava.models.Event;
import com.example.wbdv20su1averywpxserverjava.models.Film;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FilmRepository extends CrudRepository<Film, Integer> {

    @Query("SELECT film FROM Film film")
    public List<Film> findAllFilms();
    
    @Query("SELECT film FROM Film film WHERE film.user.id=:userid")
    public List<Film> findFilmsForUser(
            @Param("userid") Integer userId);

    @Query("SELECT film FROM Film film WHERE film.id=:filmid")
    public Film findFilmById(
            @Param("filmid") Integer filmId);
    
}
