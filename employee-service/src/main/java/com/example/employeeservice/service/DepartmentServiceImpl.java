package com.example.employeeservice.service;

import com.example.employeeservice.model.Department;
import com.example.employeeservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    private DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Optional<Department> findById(String id) {
        return departmentRepository.findById(id);
    }

    @Override
    public Department save(Department d) {
        d.setId(UUID.randomUUID().toString());
        return departmentRepository.save(d);
    }

    @Override
    public Optional<Department> findByName(String name) {
        return departmentRepository.findByName(name);
    }

    @Override
    public void delete(Department d) {
        departmentRepository.delete(d);
    }
}
