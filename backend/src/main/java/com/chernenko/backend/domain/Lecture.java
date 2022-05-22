package com.chernenko.backend.domain;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;
import org.hibernate.annotations.Proxy;


@Entity
@Table(name = "lectures")
@Proxy(lazy =false)
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name="group_id")
    @NotNull
    private Group group;
    
    @OneToOne
    @JoinColumn(name="course_id")
    @NotNull
    private Course course;
    
    @OneToOne
    @JoinColumn(name="professor_id")
    @NotNull
    private Professor professor;
    
    @OneToOne
    @JoinColumn(name="auditorium_id")
    @NotNull
    private Auditorium auditorium;
    
    @Column(name="start_time")
    private LocalDateTime startTime;

    public Lecture() {
    }

    public Lecture(Group group, Course course, Professor professor, Auditorium auditorium, LocalDateTime startTime) {
        this.group = group;
        this.course = course;
        this.professor = professor;
        this.auditorium = auditorium;
        this.startTime = startTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Lecture other = (Lecture) obj;

        return Objects.equals(id, other.id) && Objects.equals(group, other.group)
                && Objects.equals(course, other.course) && Objects.equals(professor, other.professor)
                && Objects.equals(auditorium, other.auditorium) && Objects.equals(startTime, other.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, group, course, professor, auditorium, startTime);
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", group=" + group +
                ", course=" + course +
                ", professor=" + professor +
                ", auditorium=" + auditorium +
                ", startTime=" + startTime +
                '}';
    }
}
