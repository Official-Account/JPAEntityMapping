package com.mapping.ManyToOne.controller;

import com.mapping.ManyToOne.dto.Student;
import com.mapping.ManyToOne.service.SchoolRepository;
import com.mapping.ManyToOne.service.SchoolService;
import com.mapping.ManyToOne.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class AppController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private SchoolService schoolService;

    @PostMapping("/rest/api/saveStudentData")
    public Student saveData(@RequestBody Student student){
        return studentService.save(student);
    }
    public List<Student> getStedentData(){
        return studentService.listAll();
    }
}
