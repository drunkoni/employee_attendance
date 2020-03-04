package com.example.attendanceservice.service;

import com.example.attendanceservice.model.Attendance;
import com.example.attendanceservice.repository.AttendanceRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    AttendanceRepository attendanceRepository;

    public AttendanceServiceImpl(AttendanceRepository attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }

    @Override
    public List<Attendance> findAll() {
        return attendanceRepository.findAll();
    }

    @Override
    public Optional<Attendance> findById(String id) {
        return attendanceRepository.findById(id);
    }

    @Override
    public Attendance save(Attendance a) {
        a.setId(UUID.randomUUID().toString());
        a.setTimestamp(new Date());
        return attendanceRepository.save(a);
    }

    @Override
    public void delete(Attendance a) {
        attendanceRepository.delete(a);
    }
}
