package com.example.demo.repository;


import com.example.demo.models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EventRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List <Event> fetchAllEvents(){
        String sql = "SELECT * FROM events";
        RowMapper<Event> rowMapper = new BeanPropertyRowMapper<>(Event.class);
        return jdbcTemplate.query(sql, rowMapper);
    }



}
