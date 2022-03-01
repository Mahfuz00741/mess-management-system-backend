package com.example.messmanagementsystembackend.controller;

import com.example.messmanagementsystembackend.dto.JomaDto;
import com.example.messmanagementsystembackend.model.Joma;
import com.example.messmanagementsystembackend.service.implemmentation.JomaServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "joma/")
@AllArgsConstructor
public class JomaController {

    private final JomaServiceImpl jomaService;

    @PostMapping(value = "save")
    public JomaDto saveJoma(@RequestBody JomaDto jomaDto){
        return jomaService.saveJoma(jomaDto);
    }

    @PutMapping(value = "update/{id}")
    public JomaDto updateJoma(@RequestBody JomaDto jomaDto, @PathVariable Long id){
        return jomaService.updateJoma(jomaDto, id);
    }

    @GetMapping(value = "get/{id}")
    public JomaDto getJoma(@PathVariable Long id){
        return jomaService.getJoma(id);
    }

    @GetMapping(value = "get/all")
    public List<Joma> getJomaList(){
        return jomaService.getJomaList();
    }

    @DeleteMapping(value = "delete/{id}")
    public String deleteJoma(@PathVariable Long id){
        return jomaService.deleteJoma(id);
    }
}
