package com.chernenko.backend.repository;

import com.chernenko.backend.domain.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRepository extends JpaRepository<Lecture, Long>{

}
