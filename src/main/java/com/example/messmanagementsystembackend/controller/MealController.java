package com.example.messmanagementsystembackend.controller;

import com.example.messmanagementsystembackend.dto.MealDto;
import com.example.messmanagementsystembackend.model.Meal;
import com.example.messmanagementsystembackend.service.implemmentation.MealServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "meal/")
@AllArgsConstructor
public class MealController {

    private final MealServiceImpl mealService;

    @PostMapping(value = "save")
    public MealDto saveMeal(@RequestBody MealDto mealDto){
        return mealService.saveMeal(mealDto);
    }

    @PutMapping(value = "update/{id}")
    public MealDto updateMeal(@RequestBody MealDto mealDto, @PathVariable Long id){
        return mealService.updateMeal(mealDto, id);
    }

    @GetMapping(value = "get/{id}")
    public MealDto getMeal(@PathVariable Long id){
        return mealService.getMeal(id);
    }

    @GetMapping(value = "get/all")
    public List<Meal> getMealList(){
        return mealService.getMealList();
    }

    @DeleteMapping(value = "delete/{id}")
    public String deleteMeal(@PathVariable Long id){
        return mealService.deleteMeal(id);
    }
}
