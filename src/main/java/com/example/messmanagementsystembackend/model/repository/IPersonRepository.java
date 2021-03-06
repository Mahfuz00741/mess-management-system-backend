package com.example.messmanagementsystembackend.model.repository;


import com.example.messmanagementsystembackend.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepository extends JpaRepository<Person, Long> {
}