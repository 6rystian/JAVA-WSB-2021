package com.company.devices;

public class Electric extends Car {
    public Electric(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.fuel = 0.0;
        this.fuelTankCapacity = 60000.0;
    }

    @Override
    public void drive(Double distance) {
        if (this.fuel / 200 >= distance) {  //spalanie - 200Wh/km - 20kWh/100km
            this.mileage += distance;
            this.fuel -= (distance * 200);
        } else System.out.println("Zbyt niskie naładowanie baterii.");
    }

    @Override
    public void reFuel() {
        this.fuel = this.fuelTankCapacity;
        System.out.println("Samochód naładowany.");
    }
}