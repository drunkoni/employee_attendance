package com.example.employeeservice.service;

import com.example.employeeservice.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

     List<Employee> findAll();
     Optional<Employee> findById(String id);
     Optional<Employee> findByFirstName(String firstName);
     Optional<Employee> findByLastName(String lastName);
     void delete(Employee e);
     Employee save(Employee e);
}
