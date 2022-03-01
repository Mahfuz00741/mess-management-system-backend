package com.example.messmanagementsystembackend.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BazarDto extends BaseDto{

    private Long person;

    private String totalTaka;

    private boolean jomaAdd;

    private LocalDate date;

    private String items;
}
