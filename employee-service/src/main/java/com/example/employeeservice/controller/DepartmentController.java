package com.example.employeeservice.controller;

import com.example.employeeservice.model.Department;
import com.example.employeeservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private DepartmentService departmentService;

    @Autowired
    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/list")
    private List<Department> listDepartments(){
        return  departmentService.findAll();
    }

    @GetMapping("/{id}")
    private Optional<Department> findDepartment(@PathVariable String id){
        return departmentService.findById(id);
    }

    @GetMapping("/{name}")
    private Optional<Department> findDepartmentByName(@PathVariable String name){
        return departmentService.findByName(name);
    }

    @PostMapping("/add")
    private Department addDepartment(@RequestBody Department department){
        return departmentService.save(department);
    }

    @PostMapping("/remove")
    //TODO Remove all employees affiliated to department
    private void removeDepartment(@RequestBody Department department){
         departmentService.delete(department);
    }

}
