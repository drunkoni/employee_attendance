package com.example.employeeservice.repository;

import com.example.employeeservice.model.Employee;
import org.springframework.data.cassandra.repository.CassandraRepository;


import java.util.List;
import java.util.Optional;


public interface EmployeeRepository extends CassandraRepository<Employee,String> {

    Optional<Employee> findByFirstName(String firstName);
    Optional<Employee> findByLastName(String lastName);
}
