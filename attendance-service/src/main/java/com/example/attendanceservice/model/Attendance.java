package com.example.attendanceservice.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;

@Table
public class Attendance {

    @PrimaryKey
    private String id;

    private Date timestamp;
    private String employee_id;

    public Attendance(String id, Date timestamp, String employee_id) {
        this.id = id;
        this.timestamp = timestamp;
        this.employee_id = employee_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }
}
