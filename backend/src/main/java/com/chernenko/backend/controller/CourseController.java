package com.chernenko.backend.controller;

import com.chernenko.backend.domain.Course;
import com.chernenko.backend.repository.CourseRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping
    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    @GetMapping("id")
    public Course getById(@PathVariable("id") Course course) {
        return course;
    }

    @PostMapping
    public Course create(@RequestBody Course course) {
        return courseRepository.save(course);
    }

    @PutMapping("{id}")
    public Course update(@PathVariable("id") Course courseFromDB, @RequestBody Course course) {
        BeanUtils.copyProperties(course, courseFromDB, "id");

        return courseRepository.save(courseFromDB);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Course course) {
        courseRepository.delete(course);
    }
}
