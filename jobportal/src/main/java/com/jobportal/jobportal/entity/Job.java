package com.jobportal.jobportal.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String description;
    private String location;
    private double salary;

    @ManyToOne
    @JoinColumn(name = "recruiter_id")
    private User recruiter;
}
