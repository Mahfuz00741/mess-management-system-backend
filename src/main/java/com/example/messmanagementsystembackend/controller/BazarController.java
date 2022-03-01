package com.example.messmanagementsystembackend.controller;

import com.example.messmanagementsystembackend.dto.BazarDto;
import com.example.messmanagementsystembackend.model.Bazar;
import com.example.messmanagementsystembackend.service.implemmentation.BazarServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "bazar/")
@AllArgsConstructor
public class BazarController {

    private final BazarServiceImpl bazarService;

    @PostMapping(value = "save")
    public BazarDto saveBazar(@RequestBody BazarDto bazarDto){
        return bazarService.saveBazar(bazarDto);
    }

    @PutMapping(value = "update/{id}")
    public BazarDto updateBazar(@RequestBody BazarDto bazarDto, @PathVariable Long id){
        return bazarService.updateBazar(bazarDto, id);
    }

    @GetMapping(value = "get/{id}")
    public BazarDto getBazar(@PathVariable Long id){
        return bazarService.getBazar(id);
    }

    @GetMapping(value = "get/all")
    public List<Bazar> getBazarList(){
        return bazarService.getBazarList();
    }

    @DeleteMapping(value = "delete/{id}")
    public String deleteBazar(@PathVariable Long id){
        return bazarService.deleteBazar(id);
    }
}
