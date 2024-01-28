package com.mapping.ManyToMany.service;

import com.mapping.ManyToMany.entity.Course;
import com.mapping.ManyToMany.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public void save(Course course){
        courseRepository.save(course);
    }

    public List<Course> listAll(){
        return  courseRepository.findAll();
    }
}
