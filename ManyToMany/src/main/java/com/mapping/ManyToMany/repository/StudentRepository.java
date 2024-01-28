package com.mapping.ManyToMany.repository;

import com.mapping.ManyToMany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
   List<Student> findBystudentNameContaining(String studentName);
}
