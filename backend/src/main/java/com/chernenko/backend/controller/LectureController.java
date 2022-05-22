package com.chernenko.backend.controller;

import com.chernenko.backend.domain.Lecture;
import com.chernenko.backend.repository.LectureRepository;
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
@RequestMapping("/api/lectures")
public class LectureController {

    private final LectureRepository lectureRepository;

    @Autowired
    public LectureController(LectureRepository lectureRepository) {
        this.lectureRepository = lectureRepository;
    }

    @GetMapping
    public List<Lecture> getAll() {
        return lectureRepository.findAll();
    }

    @GetMapping("id")
    public Lecture getById(@PathVariable("id") Lecture lecture) {
        return lecture;
    }

    @PostMapping
    public Lecture create(@RequestBody Lecture lecture) {
        return lectureRepository.save(lecture);
    }

    @PutMapping("{id}")
    public Lecture update(@PathVariable("id") Lecture lectureFromDB, @RequestBody Lecture lecture) {
        BeanUtils.copyProperties(lecture, lectureFromDB, "id");

        return lectureRepository.save(lectureFromDB);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Lecture lecture) {
        lectureRepository.delete(lecture);
    }
}
