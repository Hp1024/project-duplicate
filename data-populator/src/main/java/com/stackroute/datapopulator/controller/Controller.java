package com.stackroute.datapopulator.controller;

import com.stackroute.datapopulator.service.DataPopulatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private DataPopulatorService dataPopulatorService;

    @GetMapping
//    @KafkaListener(topics = "TopicTest", groupId = "group_id", containerFactory = "kafkaListenerContainerFactory")
    public boolean populator() {
        dataPopulatorService.dataPopulator();
        return true;
    }
}
