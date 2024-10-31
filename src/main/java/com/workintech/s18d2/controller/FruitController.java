package com.workintech.s18d2.controller;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.services.FruitService;
import com.workintech.s18d2.services.FruitServiceImpl;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruit")
public class FruitController {
    private FruitService fruitService;

    @Autowired
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @GetMapping
    public List<Fruit> getAllFruitsInc(){
        return fruitService.getByPriceAsc();
    }

    @GetMapping("/{id}")
    public Fruit getById(@PathVariable Long id){
        return fruitService.getById(id);
    }

    @Transactional
    @PostMapping
    public Fruit saveFruit(@RequestBody Fruit fruit){
        return fruitService.save(fruit);
    }

    @GetMapping("/desc")
    public List<Fruit> getAllFruitsDesc(){
        return fruitService.getByPriceDesc();
    }

    @GetMapping("/name/{name}")
    public List<Fruit> getByName(@PathVariable String name){
        return fruitService.searchByName(name);
    }

    @Transactional
    @DeleteMapping("/{id}")
    public Fruit deleteFruitById(@PathVariable Long id){
        return fruitService.delete(id);
    }



}
