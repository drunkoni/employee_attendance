package com.example.employeeservice.service;

import com.example.employeeservice.model.Department;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface DepartmentService {
    List<Department> findAll();
    Optional<Department> findById(String id);
    Optional<Department> findByName(String name);
    Department save(Department d);
    void delete(Department d);
}
