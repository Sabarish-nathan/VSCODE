package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;
import com.example.demo.service.Courseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "*")
public class CourseController implements Courseservice {

    @Autowired
    private CourseRepository courseRepository;

    @PostMapping("/add")
    @Override
    public Course addCourse(@RequestBody Course course) {
        return courseRepository.save(course);
    }

    @GetMapping("/list")
    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @GetMapping("/{name}")
    @Override
    public Course getCourseByName(@PathVariable String name) {
        return courseRepository.findByCourseName(name);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public void deleteCourse(@PathVariable Long id) {
        courseRepository.deleteById(id);
    }
}
