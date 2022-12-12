package com.ujiuye.dao;

import com.ujiuye.domain.Actor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ActorDaoTest {

    @Autowired
    ActorMapper actorMapper;


    @Test
    void findAll() {
        List<Actor> actors = actorMapper.findAll();
        actors.forEach(System.out::println);
    }

    @Test
    void findById() {
        System.out.println(actorMapper.findById(1));
    }
}