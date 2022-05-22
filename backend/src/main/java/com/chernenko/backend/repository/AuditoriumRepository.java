package com.chernenko.backend.repository;

import com.chernenko.backend.domain.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditoriumRepository extends JpaRepository<Auditorium, Long> {

}
