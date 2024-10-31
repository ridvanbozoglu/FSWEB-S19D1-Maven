package com.workintech.s18d2.controller;

import com.workintech.s18d2.entity.Vegetable;
import com.workintech.s18d2.services.VegetableService;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/vegetables")
public class VegetableController {
    private VegetableService vegetableService;

    @Autowired
    public VegetableController(VegetableService vegetableService) {
        this.vegetableService = vegetableService;
    }

    @GetMapping
    public List<Vegetable> getAll(){
        return vegetableService.getAll();
    }

    @GetMapping("/{id}")
    public Vegetable getAll(@PathVariable @Min(0) Long id){
        return vegetableService.getById(id);
    }

    @GetMapping("/desc")
    public List<Vegetable> getAllDesc(){
        return vegetableService.getAllDecs();
    }

    @PostMapping
    public Vegetable postVeg(@RequestBody Vegetable vegetable){
        return vegetableService.postOrPut(vegetable);
    }

    @GetMapping("/{name}")
    public List<Vegetable> getByName(@PathVariable String name){
        return vegetableService.getByName(name);
    }

    @DeleteMapping("/{id}")
    public Vegetable delete(@PathVariable @Min(0) Long id){
        return vegetableService.delete(id);
    }


}
