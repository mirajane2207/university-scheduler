package com.chernenko.backend.repository;

import com.chernenko.backend.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long>{

    List<Student> findStudentsByGroupId(Long groupId);
}
