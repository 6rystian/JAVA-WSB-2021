package com.company.devices;

public class LPG extends Car {
    public LPG(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.fuel = 0.0;
        this.fuelTankCapacity = 100.0;
    }

    @Override
    public void drive(Double distance) {
        if (this.fuel * 20 >= distance) {  //spalanie - 20km/l - 5l/100km
            this.mileage += distance;
            this.fuel -= (distance / 20);
        } else System.out.println("Brak wystarczającej ilości paliwa.");
    }

    @Override
    public void reFuel() {
        this.fuel = this.fuelTankCapacity;
        System.out.println("Samochód zatankowany.");
    }
}