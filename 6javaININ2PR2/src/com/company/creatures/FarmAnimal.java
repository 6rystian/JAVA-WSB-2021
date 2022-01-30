package com.company.creatures;

import com.company.Animal;

public class FarmAnimal extends Animal {
    FarmAnimal(String species) {
        super(species);
        this.alive = true;
    }
}
