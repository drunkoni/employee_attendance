package com.example.scheduleservice.service;

import com.example.scheduleservice.model.Schedule;
import com.example.scheduleservice.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    ScheduleRepository scheduleRepository;

    @Autowired
    public ScheduleServiceImpl(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    @Override
    public List<Schedule> findAll() {
        return scheduleRepository.findAll();
    }

    @Override
    public Optional<Schedule> findById(String id) {
        return scheduleRepository.findById(id);
    }

    @Override
    public Schedule save(Schedule s) {
        s.setId(UUID.randomUUID().toString());
        return scheduleRepository.save(s);
    }

    @Override
    public void delete(Schedule s) {
        scheduleRepository.delete(s);
    }
}
