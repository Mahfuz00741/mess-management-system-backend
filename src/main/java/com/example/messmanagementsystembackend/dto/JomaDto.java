package com.example.messmanagementsystembackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JomaDto extends BaseDto{

    private Long person;

    private String taka;

    private LocalDate date;
}
