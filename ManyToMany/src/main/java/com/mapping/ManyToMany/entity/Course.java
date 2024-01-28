package com.mapping.ManyToMany.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "jpa_course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_title", length = 50)
    private String title;

    @Column(name = "course_fee", length = 50)
    private double fee;

    @Column(name = "course_duration", length =20)
    private double duration;

    @ManyToMany(mappedBy = "courses" , fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Student> studentSet;


}
