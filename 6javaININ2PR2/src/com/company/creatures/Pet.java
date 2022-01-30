package com.company.creatures;

import com.company.Animal;

public class Pet extends Animal {
    public Pet(String species) {
        super(species);
        this.alive = true;
    }
}

