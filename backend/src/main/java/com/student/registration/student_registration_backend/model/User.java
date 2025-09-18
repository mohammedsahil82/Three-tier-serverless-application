package com.student.registration.student_registration_backend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String course;

    @Column(name = "student_class")
    private String studentClass;

    // Use BigDecimal to match DECIMAL in DB
    @Column(precision = 10, scale = 2)
    private BigDecimal percentage;

    private String branch;

    @Column(name = "mobile_number")
    private String mobileNumber;
}
