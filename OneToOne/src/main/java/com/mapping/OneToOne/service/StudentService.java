package com.mapping.OneToOne.service;

import com.mapping.OneToOne.dto.Student;
import com.mapping.OneToOne.ropository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public  void save(Student student){
        repo.save(student);
    }

    public  Student get(Long studentId){
        return repo.findById(studentId).get();
    }

    public List<Student> listAll(){
        return repo.findAll();
    }

    public void  delete(Long studentId){
         repo.deleteById(studentId);
    }

}
