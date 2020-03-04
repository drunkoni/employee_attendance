package com.example.attendanceservice.controller;

import com.example.attendanceservice.model.Attendance;
import com.example.attendanceservice.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    AttendanceService attendanceService;

    @Autowired
    public void setAttendanceService(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
    }


    @GetMapping("/list")
    private List<Attendance> attendanceList(){
        return attendanceService.findAll();
    }


    @GetMapping("/{id}")
    private Optional<Attendance> findAttendance(@PathVariable String id){
        return attendanceService.findById(id);
    }


    @PostMapping("/add")
    private Attendance addSAttendance(@RequestBody Attendance attendance){
        return attendanceService.save(attendance);
    }

    @PostMapping("/remove")
    private void removeAttendance(@RequestBody Attendance attendance){
        attendanceService.delete(attendance);
    }

}
