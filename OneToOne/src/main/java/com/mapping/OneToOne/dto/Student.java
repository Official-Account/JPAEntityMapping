package com.mapping.OneToOne.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
@Table(name = "jpa_student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "studentName" , length = 50 )
    private String studentName;

    @Column(name = "student_age" , length = 50)
    private int studentAge;

    @Column(name = "user_name" , length = 12)
    private String studentGender;

    //@OneToOne(mappedBy = "student")// this will add student_student_id FK in laptop table
    //@OneToOne
    //private Laptop laptop;


}
