package com.company.creatures;

import com.company.creatures.Animal;

public class FarmAnimal extends Animal implements Edible{
    FarmAnimal(String species) {
        super(species);
        this.alive = true;
    }

    @Override
    public void beEaten()
    {
        this.alive = false;
        this.weight = 0.0;
    }
}