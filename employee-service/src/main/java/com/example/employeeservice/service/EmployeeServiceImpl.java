package com.example.employeeservice.service;

import com.example.employeeservice.model.Employee;
import com.example.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findById(String id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Optional<Employee> findByFirstName(String firstName) {
        return employeeRepository.findByFirstName(firstName);
    }

    @Override
    public Optional<Employee> findByLastName(String lastName) {
        return employeeRepository.findByLastName(lastName);
    }

    @Override
    public void delete(Employee e) {
        employeeRepository.delete(e);
    }

    @Override
    public Employee save(Employee e) {
        e.setId(UUID.randomUUID().toString());
        return employeeRepository.save(e);
    }
}
