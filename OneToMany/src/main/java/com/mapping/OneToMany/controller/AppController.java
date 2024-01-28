package com.mapping.OneToMany.controller;

import com.mapping.OneToMany.dto.Student;
import com.mapping.OneToMany.dto.StudentRequestEntity;
import com.mapping.OneToMany.dto.StudentResponseEntity;
import com.mapping.OneToMany.ropository.AddressRepository;
import com.mapping.OneToMany.ropository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class AppController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private AddressRepository addressRepository;

    @PostMapping("/rest/api/saveStudent")
    public Student saveData(@RequestBody StudentRequestEntity requestStudent){
        return studentRepository.save(requestStudent.getStudent());
    }

    @GetMapping("/rest/api/getData")
    public List<Student> getStudents(){
        return  studentRepository.findAll();
    }

//    @GetMapping("/rest/api/getJoinData")
//    public List<StudentResponseEntity> getJoin(){
//        System.out.println("con...");
//        return  studentRepository.getJoinOperation();
//    }
    //////////// Laptop controller
}
