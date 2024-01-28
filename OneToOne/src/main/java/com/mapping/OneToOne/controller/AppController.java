package com.mapping.OneToOne.controller;

import com.mapping.OneToOne.dto.Laptop;
import com.mapping.OneToOne.dto.Student;
import com.mapping.OneToOne.ropository.StudentRepository;
import com.mapping.OneToOne.service.LaptopService;
import com.mapping.OneToOne.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class AppController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private LaptopService laptopService;


    //////////// Laptop controller


    // RESTful API method for Create operation
    @PostMapping("/rest/api/saveStudent")
    public  void  save(@RequestBody Student student){
        studentService.save(student);
    }

    // RESTful API methods for Retrieval operations
    @GetMapping("/rest/api/getStudents")
    public List<Student> getStudents(){
        return  studentService.listAll();
    }

    @GetMapping("/rest/api/getStudent")
    public  ResponseEntity<Student> getStudent(@PathVariable Long studentId){

        try {
            Student student = studentService.get(studentId);
            return  new ResponseEntity<Student>(student, HttpStatus.OK);
        }catch (NoSuchElementException e){
            e.printStackTrace();
            return  new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }
    }

    // RESTful API method for Update operation
    @PutMapping("/rest/api/updateStudent/{id}")
    public  ResponseEntity<?> update(@RequestBody Student student, @PathVariable Long studentId){

        try {
            Student existstudent = studentService.get(studentId);
                studentService.save(student);
                return  new ResponseEntity<>(HttpStatus.OK);
        }catch (NoSuchElementException e){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // RESTful API method for Delete operation
    @DeleteMapping("/rest/api/delStudent/{id}")
    public  void deleteStudent(@PathVariable Long studentId){
        studentService.delete(studentId);
        }



        //////////// Laptop controller
    @PostMapping("/rest/api/saveLaptop")
    public void save(@RequestBody Laptop laptop){
        laptopService.save(laptop);
    }

}
