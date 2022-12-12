package com.ujiuye.dao;

import com.ujiuye.domain.Movie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MovieDaoTest {
    @Autowired
    MovieMapper movieDao;

    @Test
    void findAll() {
        List<Movie> movies = movieDao.findAll();
        movies.forEach(movie -> {
            System.out.println(movie.getName());
            System.out.println(movie.getCategories());
            System.out.println(movie.getActors());
        });
    }
}