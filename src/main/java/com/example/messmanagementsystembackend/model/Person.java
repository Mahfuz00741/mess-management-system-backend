package com.example.messmanagementsystembackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "MEMBER")
@NoArgsConstructor
@AllArgsConstructor
public class Person extends BaseEntity{

    @Column(name = "member_name", unique = true, nullable = false)
    private String name;

    private String age;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String phone;
}
