package com.workintech.s18d2.services;

import com.workintech.s18d2.exceptions.PlantException;
import com.workintech.s18d2.repository.FruitRepository;
import com.workintech.s18d2.entity.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitServiceImpl implements FruitService{
    private final FruitRepository fruitRepository;

    @Autowired
    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Override
    public Fruit getById(Long id) {
        Optional<Fruit> optionalFruit = fruitRepository.findById(id);
        if(!optionalFruit.isPresent()){
            throw new PlantException("Fruit with given id does not exists", HttpStatus.NOT_FOUND);
        }else return optionalFruit.get();
    }

    @Override
    public List<Fruit> getByPriceDesc() {
        return fruitRepository.getByPriceDesc();
    }

    @Override
    public List<Fruit> searchByName(String name) {
        return fruitRepository.searchByName(name);
    }

    @Override
    public Fruit save(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public Fruit delete(Long id) {
        Optional<Fruit> optionalFruit = fruitRepository.findById(id);
        if (optionalFruit.isPresent()){
            fruitRepository.delete(optionalFruit.get());
            return optionalFruit.get();
        }else return null;
    }

    @Override
    public List<Fruit> getByPriceAsc() {
        return fruitRepository.getByPriceAsc();
    }
}
