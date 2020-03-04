package com.example.scheduleservice.model;


import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;

@Table
public class Schedule {

    @PrimaryKey
    private String id;

    private String name;
    private Date start;
    private Date end;
    private Date expirationDate;
    private String department_id;

    public Schedule(String id, String name, Date start, Date end, Date expirationDate, String department_id) {
        this.id = id;
        this.name = name;
        this.start = start;
        this.end = end;
        this.expirationDate = expirationDate;
        this.department_id = department_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }
}
