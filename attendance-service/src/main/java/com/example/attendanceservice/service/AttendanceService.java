package com.example.attendanceservice.service;

import com.example.attendanceservice.model.Attendance;

import java.util.List;
import java.util.Optional;

public interface AttendanceService {
    List<Attendance> findAll();
    Optional<Attendance> findById(String id);
    Attendance save(Attendance a);
    void delete(Attendance a);
}
