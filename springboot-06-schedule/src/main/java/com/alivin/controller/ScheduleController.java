package com.alivin.controller;

import com.alivin.service.ScheduledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduleController {

    @Autowired
    private ScheduledService scheduledService;

    @RequestMapping("/test")
    public String test() {
        scheduledService.schedule();
        return "test";
    }
}
