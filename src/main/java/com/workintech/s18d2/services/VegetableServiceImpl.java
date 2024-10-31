package com.workintech.s18d2.services;

import com.workintech.s18d2.repository.VegetableRepository;
import com.workintech.s18d2.entity.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class VegetableServiceImpl implements VegetableService{
    private VegetableRepository vegetableRepository;

    @Autowired
    public VegetableServiceImpl(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }

    @Override
    public List<Vegetable> getAll() {
        return vegetableRepository.getAllInc();
    }

    @Override
    public Vegetable getById(Long id) {
        return vegetableRepository.getById(id);
    }

    @Override
    public List<Vegetable> getAllDecs() {
        return vegetableRepository.getAllDesc();
    }

    @Override
    public Vegetable postOrPut(Vegetable vegetable) {
        return vegetableRepository.save(vegetable);
    }

    @Override
    public List<Vegetable> getByName(String name) {
        return vegetableRepository.getByName(name);
    }

    @Override
    public Vegetable delete(Long id) {
        vegetableRepository.deleteById(id);
        return vegetableRepository.getById(id);
    }
}
