package com.mapping.OneToMany.service;

import com.mapping.OneToMany.dto.Student;
import com.mapping.OneToMany.ropository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/*@Service
@Transactional*/
public class StudentService {

    @Autowired
    private StudentRepository repo;

   public  void save(Student student){
        repo.save(student);
    }

    public void  SaveAll(List<Student> student){
            repo.saveAll(student);
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
