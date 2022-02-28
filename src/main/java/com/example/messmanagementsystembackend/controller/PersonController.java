package com.example.messmanagementsystembackend.controller;

import com.example.messmanagementsystembackend.dto.PersonDto;
import com.example.messmanagementsystembackend.model.Person;
import com.example.messmanagementsystembackend.service.implemmentation.PersonServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "member/")
public class PersonController {

    private final PersonServiceImpl personService;

    @PostMapping(value = "save")
    public PersonDto savePerson(@RequestBody PersonDto personDto){
        return personService.savePerson(personDto);
    }

    @PutMapping(value = "update/{id}")
    public PersonDto updatePerson(@RequestBody PersonDto personDto, @PathVariable Long id){
        return personService.updatePerson(personDto, id);
    }

    @GetMapping(value = "get/{id}")
    public PersonDto getPerson(@PathVariable Long id){
        return personService.getPerson(id);
    }

    @GetMapping(value = "get/all")
    public List<Person> getPersonList(){
        return personService.getPersonList();
    }

    @DeleteMapping(value = "delete/{id}")
    public String deletePerson(@PathVariable Long id){
        return personService.deletePerson(id);
    }
}
