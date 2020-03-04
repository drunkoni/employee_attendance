package com.example.employeeservice.repository;

import com.example.employeeservice.model.Department;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.Optional;

public interface DepartmentRepository extends CassandraRepository<Department,String> {
    Optional<Department> findByName(String name);
}
