package com.example.employeeservice.controller;

import com.example.employeeservice.model.Department;
import com.example.employeeservice.model.Employee;
import com.example.employeeservice.service.DepartmentService;
import com.example.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;
    private DepartmentService departmentService;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Autowired
    public void setDepartmentService(DepartmentService departmentService) { this.departmentService = departmentService; }

    @GetMapping("/list")
    private List<Employee> employeeList(){

        return employeeService.findAll();
    }

    @GetMapping("/id/{id}")
    Optional<Employee> findEmployee(@PathVariable String id){
        return employeeService.findById(id);
    }

    @GetMapping("/name/{firstName}")
    private Optional<Employee> findEmployeeByName(@PathVariable String firstName){
        return employeeService.findByFirstName(firstName);
    }

    @PostMapping("/add")
    //TODO throw exception if department not found
    private Employee addEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);

    }

    @PostMapping("/remove")
    private void employeeRemove(@RequestBody Employee employee){
        employeeService.delete(employee);
    }



}
