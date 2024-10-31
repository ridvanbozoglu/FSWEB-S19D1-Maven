package com.workintech.s18d2.repository;

import com.workintech.s18d2.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable, Long> {
    @Query("select v from Vegetable v order by v.price desc")
    List<Vegetable> getAllDesc();
    @Query("select v from Vegetable v order by v.price")
    List<Vegetable> getAllInc();
    @Query("select v from Vegetable v where lower(v.name) like lower(concat('%', :name, '%'))")
    List<Vegetable> getByName(String name);



}
