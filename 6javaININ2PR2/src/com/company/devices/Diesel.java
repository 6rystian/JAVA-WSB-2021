package com.company.devices;

public class Diesel extends Car {
    Double fuel;
    public Diesel(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.fuel=0.0;
    }
}