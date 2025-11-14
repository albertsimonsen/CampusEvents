package com.example.demo.controllers;


import com.example.demo.models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.service.EventService;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    EventService eventService;

    @GetMapping("/")
    public String index (Model model){
        List<Event> eventList = eventService.fetchAllEvents();
        model.addAttribute("events", eventList);
        return "home/index";


    }
}
