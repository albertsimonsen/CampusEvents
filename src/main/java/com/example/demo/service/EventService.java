package com.example.demo.service;


import com.example.demo.models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.EventRepo;

import java.util.List;

@Service
public class EventService {

    @Autowired
    EventRepo eventRepo;

    public List <Event> fetchAllEvents(){
        return eventRepo.fetchAllEvents();
    }


}
