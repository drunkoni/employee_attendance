package com.example.scheduleservice.controller;

import com.example.scheduleservice.model.Schedule;
import com.example.scheduleservice.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    ScheduleService scheduleService;

    @Autowired
    public void setScheduleService(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping("/list")
    private List<Schedule> scheduleList(){
        return scheduleService.findAll();
    }


    @GetMapping("/{id}")
    private Optional<Schedule> findSchedule(@PathVariable String id){
        return scheduleService.findById(id);
    }


    @PostMapping("/add")
    private Schedule addSchedule(@RequestBody Schedule schedule){
        return scheduleService.save(schedule);
    }

    @PostMapping("/remove")
    private void removeSchedule(@RequestBody Schedule schedule){
        scheduleService.delete(schedule);
    }

}
