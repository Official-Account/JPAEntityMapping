package com.mapping.ManyToMany.service;

import com.mapping.ManyToMany.entity.Student;
import com.mapping.ManyToMany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student save(Student student){
        return  studentRepository.save(student);
    }

    public Student getStudent(Long sid){
        return studentRepository.findById(sid).get();
    }

    public List<Student> getStudents(){
        return  studentRepository.findAll();
    }
}
