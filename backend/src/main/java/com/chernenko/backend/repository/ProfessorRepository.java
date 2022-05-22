package com.chernenko.backend.repository;

import com.chernenko.backend.domain.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

   List<Professor> findProfessorsByCoursesId(Long courseId);
}
