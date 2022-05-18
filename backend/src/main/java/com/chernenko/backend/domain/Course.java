package com.chernenko.backend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Proxy;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import javax.persistence.JoinColumn;

@Entity
@Table(name = "courses")
@Proxy(lazy = false)
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;


    @JsonIgnore
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "professors_courses", joinColumns = {@JoinColumn(name = "course_id")}, inverseJoinColumns = {
            @JoinColumn(name = "professor_id")})
    private List<Professor> professors;


    @JsonIgnore
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "students_courses", joinColumns = {@JoinColumn(name = "course_id")}, inverseJoinColumns = {
            @JoinColumn(name = "student_id")})
    private List<Student> students;

    public Course() {
    }

    public Course(String name, String description, List<Professor> professors, List<Student> students) {
        this.name = name;
        this.description = description;
        this.professors = professors;
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Course other = (Course) obj;

        return Objects.equals(id, other.id)
                && Objects.equals(name, other.name)
                && Objects.equals(professors, other.professors)
                && Objects.equals(students, other.students)
                && Objects.equals(description, other.description);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, professors, students, description);
    }
}
