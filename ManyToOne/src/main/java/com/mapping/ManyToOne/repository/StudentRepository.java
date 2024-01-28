package com.mapping.ManyToOne.repository;

import com.mapping.ManyToOne.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
