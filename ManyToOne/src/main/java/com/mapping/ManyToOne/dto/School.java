package com.mapping.ManyToOne.dto;

import com.mapping.ManyToOne.service.StudentService;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


    @Entity
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    public class School {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "school_id")
        private Long schoolId;

        @Column(name = "school_name" , length = 50 )
        private String schoolName;

        @Column(name = "school_age" , length = 50)
        private int schoolAddress;

        @Column(name = "school_staff" , length = 50)
        private int schoolStaff;

//        @OneToMany(cascade = CascadeType.ALL, mappedBy = "school")
//        private StudentService student;


    }
