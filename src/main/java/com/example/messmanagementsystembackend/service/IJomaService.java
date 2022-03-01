package com.example.messmanagementsystembackend.service;

import com.example.messmanagementsystembackend.dto.JomaDto;
import com.example.messmanagementsystembackend.model.Joma;

import java.util.List;

public interface IJomaService {

    JomaDto saveJoma(JomaDto jomaDto);
    JomaDto updateJoma(JomaDto jomaDto, Long id);
    JomaDto getJoma(Long id);
    List<Joma> getJomaList();
    String deleteJoma(Long id);
}
