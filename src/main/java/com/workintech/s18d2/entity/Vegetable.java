package com.workintech.s18d2.entity;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Vegetable {
    private Long id;
    private String name;
    private double price;
    private boolean isGrownOnTree;
}
