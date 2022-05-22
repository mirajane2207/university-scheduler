package com.chernenko.backend.controller;

import com.chernenko.backend.domain.Student;
import com.chernenko.backend.repository.StudentRepository;
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
@RequestMapping("/api/students")
public class StudentController {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @GetMapping("id")
    public Student getById(@PathVariable("id") Student student) {
        return student;
    }

    @PostMapping
    public Student create(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @PutMapping("{id}")
    public Student update(@PathVariable("id") Student studentFromDB, @RequestBody Student student) {
        BeanUtils.copyProperties(student, studentFromDB, "id");

        return studentRepository.save(studentFromDB);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Student student) {
        studentRepository.delete(student);
    }
}
