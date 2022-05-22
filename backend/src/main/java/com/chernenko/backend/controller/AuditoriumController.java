package com.chernenko.backend.controller;

import com.chernenko.backend.domain.Auditorium;
import com.chernenko.backend.repository.AuditoriumRepository;
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
@RequestMapping("/api/auditoriums")
public class AuditoriumController {

    private final AuditoriumRepository auditoriumRepository;

    @Autowired
    public AuditoriumController(AuditoriumRepository auditoriumRepository) {
        this.auditoriumRepository = auditoriumRepository;
    }

    @GetMapping
    public List<Auditorium> getAll() {
        return auditoriumRepository.findAll();
    }

    @GetMapping("id")
    public Auditorium getById(@PathVariable("id") Auditorium auditorium) {
        return auditorium;
    }

    @PostMapping
    public Auditorium create(@RequestBody Auditorium auditorium) {
        return auditoriumRepository.save(auditorium);
    }

    @PutMapping("{id}")
    public Auditorium update(@PathVariable("id") Auditorium auditoriumFromDB, @RequestBody Auditorium auditorium) {
        BeanUtils.copyProperties(auditorium, auditoriumFromDB, "id");

        return auditoriumRepository.save(auditoriumFromDB);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Auditorium auditorium) {
        auditoriumRepository.delete(auditorium);
    }
}
