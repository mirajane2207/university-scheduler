package com.chernenko.backend.controller;

import com.chernenko.backend.domain.Professor;
import com.chernenko.backend.repository.ProfessorRepository;
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
@RequestMapping("/api/professors")
public class ProfessorController {

    private final ProfessorRepository professorRepository;

    @Autowired
    public ProfessorController(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    @GetMapping
    public List<Professor> getAll() {
        return professorRepository.findAll();
    }

    @GetMapping("id")
    public Professor getById(@PathVariable("id") Professor professor) {
        return professor;
    }

    @PostMapping
    public Professor create(@RequestBody Professor professor) {
        return professorRepository.save(professor);
    }

    @PutMapping("{id}")
    public Professor update(@PathVariable("id") Professor professorFromDB, @RequestBody Professor professor) {
        BeanUtils.copyProperties(professor, professorFromDB, "id");

        return professorRepository.save(professorFromDB);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Professor professor) {
        professorRepository.delete(professor);
    }
}
