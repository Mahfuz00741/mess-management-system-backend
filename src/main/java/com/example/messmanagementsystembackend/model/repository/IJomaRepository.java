package com.example.messmanagementsystembackend.model.repository;

import com.example.messmanagementsystembackend.model.Joma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJomaRepository extends JpaRepository<Joma, Long> {
}
