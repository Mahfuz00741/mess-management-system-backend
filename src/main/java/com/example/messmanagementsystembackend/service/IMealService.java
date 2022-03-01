package com.example.messmanagementsystembackend.service;

import com.example.messmanagementsystembackend.dto.MealDto;
import com.example.messmanagementsystembackend.model.Meal;

import java.util.List;

public interface IMealService {
    MealDto saveMeal(MealDto mealDto);
    MealDto updateMeal(MealDto mealDto, Long id);
    MealDto getMeal(Long id);
    List<Meal> getMealList();
    String deleteMeal(Long id);
}
