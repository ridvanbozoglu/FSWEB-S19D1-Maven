package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;
import org.springframework.stereotype.Service;

import java.util.List;


public interface FruitService {
    List<Fruit> getByPriceAsc();
    Fruit getById(Long id);
    List<Fruit> getByPriceDesc();
    List<Fruit> searchByName(String name);
    Fruit save(Fruit fruit);
    Fruit delete(Long id);
}
