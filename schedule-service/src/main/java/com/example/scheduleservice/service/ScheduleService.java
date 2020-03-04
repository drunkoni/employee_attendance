package com.example.scheduleservice.service;

import com.example.scheduleservice.model.Schedule;
import com.example.scheduleservice.repository.ScheduleRepository;

import java.util.List;
import java.util.Optional;

public interface ScheduleService {
    List<Schedule> findAll();
    Optional<Schedule> findById(String id);
    Schedule save(Schedule s);
    void delete(Schedule s);
}
