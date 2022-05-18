package com.chernenko.backend.domain;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;


@Entity
@Table(name = "students")
@Proxy(lazy =false)
public class Student extends Member {

    @ManyToOne
    @JoinColumn(name="group_id", nullable=false)
    private Group group;

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;

    public Student() {
    }

    public Student(String name, String surname, String email, Group group, List<Course> courses) {
        super(name, surname, email);
        this.group = group;
        this.courses = courses;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
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

        Student other = (Student) obj;

        return Objects.equals(id, other.id) &&
                Objects.equals(name, other.name) &&
                Objects.equals(surname, other.surname) &&
                Objects.equals(email, other.email) &&
                Objects.equals(courses, other.courses) &&
                Objects.equals(group, other.group);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, email, group, courses);
    }

    @Override
    public String toString() {
        return "Student{" +
                "group=" + group +
                ", courses=" + courses +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
