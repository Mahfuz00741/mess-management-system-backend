package com.example.messmanagementsystembackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "MEAL_TABLE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Meal extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "PERSON_ID", nullable = false)
    private Person person;

    @Column(nullable = false)
    private String morning;

    @Column(nullable = false)
    private String noon;

    @Column(nullable = false)
    private String night;

    @DateTimeFormat
    private LocalDate date;
}
