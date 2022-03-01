package com.example.messmanagementsystembackend.service.implemmentation;

import com.example.messmanagementsystembackend.dto.MealDto;
import com.example.messmanagementsystembackend.model.Meal;
import com.example.messmanagementsystembackend.model.Person;
import com.example.messmanagementsystembackend.model.repository.IMealRepository;
import com.example.messmanagementsystembackend.model.repository.IPersonRepository;
import com.example.messmanagementsystembackend.service.IMealService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MealServiceImpl implements IMealService {

    private final IPersonRepository iPersonRepository;
    private final IMealRepository iMealRepository;

    @Override
    public MealDto saveMeal(MealDto mealDto) {
        Meal meal = new Meal();
        Person person = new Person();
        BeanUtils.copyProperties(mealDto, meal, "person");
        meal.setPerson(iPersonRepository.getById(mealDto.getPerson()));
        iMealRepository.save(meal);
        return mealDto;
    }

    @Override
    public MealDto updateMeal(MealDto mealDto, Long id) {
        Meal meal = iMealRepository.getById(id);
        BeanUtils.copyProperties(mealDto, meal, "id", "person");
        meal.setPerson(iPersonRepository.getById(mealDto.getPerson()));
        iMealRepository.save(meal);
        return mealDto;
    }

    @Override
    public MealDto getMeal(Long id) {
        MealDto mealDto = new MealDto();
        Meal meal = iMealRepository.getById(id);
        BeanUtils.copyProperties(meal, mealDto);
        return mealDto;
    }

    @Override
    public List<Meal> getMealList() {
        List<Meal> meal = iMealRepository.findAll();
        return meal;
    }

    @Override
    public String deleteMeal(Long id) {
        iMealRepository.deleteById(id);
        return "Delete Success";
    }
}
