package com.example.messmanagementsystembackend.service;

import com.example.messmanagementsystembackend.dto.PersonDto;
import com.example.messmanagementsystembackend.model.Person;

import java.util.List;

public interface IPersonService {

    PersonDto savePerson(PersonDto personDto);
    PersonDto updatePerson(PersonDto personDto, Long id);
    PersonDto getPerson(Long id);
    List<Person> getPersonList();
    String deletePerson(Long id);

}
