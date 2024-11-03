package com.workintech.s18d2.services;


import com.workintech.s18d2.entity.Vegetable;
import org.springframework.stereotype.Service;

import java.util.List;


public interface VegetableService {
    List<Vegetable> getAll();

    Vegetable getById(Long id);

    List<Vegetable> getAllDecs();

    Vegetable postOrPut(Vegetable vegetable);

    List<Vegetable> getByName(String name);

    Vegetable delete(Long id);
}
