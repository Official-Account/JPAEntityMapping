package com.mapping.ManyToOne.service;

import com.mapping.ManyToOne.dto.Student;
import com.mapping.ManyToOne.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class StudentService {

    @Autowired
    private StudentRepository rep;
    public Student save(Student student){
        return  rep.save(student);
    }
    public  Student getStudent(Long sid){
        return rep.findById(sid).get();
    }
    public List<Student> listAll(){
        return rep.findAll();
    }

}
