package com.example.demo.service;

import com.example.demo.entity.Course;
import java.util.List;

public interface Courseservice {
    Course addCourse(Course course);
    List<Course> getAllCourses();
    Course getCourseByName(String name);
    void deleteCourse(Long id);
}
