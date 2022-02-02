package com.company.devices;

public class Diesel extends Car {
    public Diesel(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.fuel = 0.0;
        this.fuelTankCapacity = 100.0;
    }

    @Override
    public void drive(Double distance) {
        if (this.fuel * 15 >= distance) {  //spalanie - 15km/l - 6.666666l/100km
            this.mileage += distance;
            this.fuel -= (distance / 15);
        } else System.out.println("Brak wystarczającej ilości paliwa.");
    }

    @Override
    public void reFuel() {
        this.fuel = this.fuelTankCapacity;
        System.out.println("Samochód zatankowany.");
    }
}