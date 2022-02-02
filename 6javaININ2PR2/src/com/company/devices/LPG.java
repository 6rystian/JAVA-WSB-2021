package com.company.devices;

public class LPG extends Car {
    Double fuel;
    public LPG(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.fuel=0.0;
    }
}