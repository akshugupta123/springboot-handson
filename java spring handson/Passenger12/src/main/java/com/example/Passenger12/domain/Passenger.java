package com.example.Passenger12.domain;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Passenger {

    private Long id;
    private String name;

    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate dob;
    private String phone;
    private String email;

    // Constructors
    public Passenger() {
    }

    public Passenger(String name, LocalDate dob, String phone, String email) {
        this.name = name;
        this.dob = dob;
        this.phone = phone;
        this.email = email;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
