package com.example.backend.repository;

import com.example.backend.entity.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuditoriumRepository extends JpaRepository<Auditorium, UUID> {
}
