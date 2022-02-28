package com.example.messmanagementsystembackend.service.implemmentation;

import com.example.messmanagementsystembackend.dto.PersonDto;
import com.example.messmanagementsystembackend.model.Person;
import com.example.messmanagementsystembackend.model.repository.IPersonRepository;
import com.example.messmanagementsystembackend.service.IPersonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements IPersonService {

    private final IPersonRepository iPersonRepository;

    @Override
    public PersonDto savePerson(PersonDto personDto) {
        Person person = new Person();
        BeanUtils.copyProperties(personDto, person);
        iPersonRepository.save(person);
        return personDto;
    }

    @Override
    public PersonDto updatePerson(PersonDto personDto, Long id) {
        Person person = iPersonRepository.getById(id);
        BeanUtils.copyProperties(personDto, person, "id");
        iPersonRepository.save(person);
        return personDto;
    }

    @Override
    public PersonDto getPerson(Long id) {
        PersonDto personDto = new PersonDto();
        Person person = iPersonRepository.getById(id);
        BeanUtils.copyProperties(person, personDto);
        return personDto;
    }

    @Override
    public List<Person> getPersonList() {
        List<Person> person = iPersonRepository.findAll();
        return person;
    }

    @Override
    public String deletePerson(Long id) {
        iPersonRepository.deleteById(id);
        return "Delete Success";
    }
}
