package com.example.attendanceservice.repository;

import com.example.attendanceservice.model.Attendance;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface AttendanceRepository extends CassandraRepository<Attendance,String> {
}
