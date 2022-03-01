package com.example.messmanagementsystembackend.model.repository;

import com.example.messmanagementsystembackend.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMealRepository extends JpaRepository<Meal, Long> {
}
