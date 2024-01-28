package com.mapping.ManyToOne.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

    @Entity
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    public class Student {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "student_id")
        private Long studentId;

        @Column(name = "student_Name" , length = 50 )
        private String studentName;

        @Column(name = "student_age" , length = 50)
        private int studentAge;

        @Column(name = "student_gender" , length = 12)
        private String studentGender;

        @ManyToOne
        @JoinColumn(name = "school_id")
        private List<School> school;

    }
