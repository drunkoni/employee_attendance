package com.example.scheduleservice.repository;


import com.example.scheduleservice.model.Schedule;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface ScheduleRepository extends CassandraRepository<Schedule,String> {
}
