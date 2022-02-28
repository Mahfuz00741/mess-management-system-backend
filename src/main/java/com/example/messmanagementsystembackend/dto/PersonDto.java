package com.example.messmanagementsystembackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto extends BaseDto {

    private String name;

    private String age;

    private String email;

    private String phone;

}
