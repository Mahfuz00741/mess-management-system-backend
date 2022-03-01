package com.example.messmanagementsystembackend.service;

import com.example.messmanagementsystembackend.dto.BazarDto;
import com.example.messmanagementsystembackend.model.Bazar;

import java.util.List;

public interface IBazarService {
    BazarDto saveBazar(BazarDto bazarDto);
    BazarDto updateBazar(BazarDto bazarDto, Long id);
    BazarDto getBazar(Long id);
    List<Bazar> getBazarList();
    String deleteBazar(Long id);
}
