package com.example.messmanagementsystembackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "BAZAR_TABLE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bazar extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "PERSON_ID", nullable = false)
    private Person person;

    @Column(nullable = false)
    private String totalTaka;

    @Column(nullable = false)
    private boolean jomaAdd;

    @DateTimeFormat
    private LocalDate date;

    @Column(nullable = false)
    private String items;
}
