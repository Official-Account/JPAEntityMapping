package com.mapping.ManyToMany.controller;

import com.mapping.ManyToMany.entity.Student;
import com.mapping.ManyToMany.repository.CourseRepository;
import com.mapping.ManyToMany.repository.StudentRepository;
import com.mapping.ManyToMany.service.CourseService;
import com.mapping.ManyToMany.service.StudentService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log
public class AppController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @PostMapping("/mtm/savedata")
    public Student SaveStudentCourseData(@RequestBody Student student){
         return  studentService.save(student);
    }

//    @GetMapping("/mtm/{id}")
//    public ResponseEntity<Student> getStudent(@PathVariable Long sid){
//       try {
//           Student student = studentService.getStudent(sid);
//           if(student!=null)
//               return  new ResponseEntity<Student> (HttpStatus.OK);
//           else
//               return  new ResponseEntity<Student> (HttpStatus.NOT_FOUND);
//       }
//       catch (Exception e){
//           log.info("Exception at getStudent{}  "+e.getMessage());
//           return  new ResponseEntity<Student> (HttpStatus.NOT_FOUND);
//       }
//    }
//
//    @GetMapping("/mtm/getStudents")
//    public List<Student> getStudents(){
//        return studentService.getStudents();
//    }

}
