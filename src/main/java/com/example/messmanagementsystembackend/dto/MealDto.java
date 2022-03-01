package com.example.messmanagementsystembackend.dto;

import com.example.messmanagementsystembackend.model.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MealDto extends BaseDto{

    private Long person;

    private String morning;

    private String noon;

    private String night;

    private LocalDate date;
}
