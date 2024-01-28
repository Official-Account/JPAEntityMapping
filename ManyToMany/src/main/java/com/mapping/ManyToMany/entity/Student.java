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
@Table(name = "jpa_student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long studentId;

    @Column(name = "student_name", length = 50)
    private String studentName;

    @Column(name = "student_age", length = 50)
    private int studentAge;

    @Column(name = "student_gender", length = 12)
    private String studentGender;

    @Column(name = "student_dept", length = 20)
    private String studentDept;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "jpa_student_course",
            joinColumns = {
                    @JoinColumn(name = "student_id", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "course_id", referencedColumnName = "id")
            }
    )
    @JsonBackReference
    private Set<Course> courses;

}
