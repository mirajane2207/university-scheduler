package com.chernenko.backend.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "professors")
@Proxy(lazy = false)

public class Professor extends Member {

    @ManyToMany(mappedBy = "professors")
    private List<Course> courses;

    public Professor() {
    }

    public Professor(String name, String surname, String email, List<Course> courses) {
        super(name, surname, email);
        this.courses = courses;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Professor other = (Professor) obj;

        return Objects.equals(id, other.id) &&
                Objects.equals(name, other.name) &&
                Objects.equals(surname, other.surname) &&
                Objects.equals(email, other.email) &&
                Objects.equals(courses, other.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, email, courses);
    }
}
