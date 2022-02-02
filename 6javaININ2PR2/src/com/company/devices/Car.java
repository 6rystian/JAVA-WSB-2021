package com.company.devices;

import com.company.creatures.Human;

public abstract class Car extends Device {
    Double mileage;
    public Double value;
    public Double fuelTankCapacity;
    public Double fuel;

    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.mileage = 0.0;
    }

    public void turnOn() {
        System.out.println("Przekręcam kluczyk.");
    }

    public String toString() {
        return "Producent i model: " + producer + " " + model + "; rok produkcji: " + yearOfProduction + "; przebieg (w km): " + mileage + "; wartość/cena (w zł): " + value;
    }

    public abstract void drive(Double distance);

    public Double getMileage() {
        return this.mileage;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;

        return producer.equals(other.producer) && model.equals(other.model) && yearOfProduction.equals(other.yearOfProduction) && value.equals(other.value) && mileage.equals(other.mileage);

    }


    @Override
    public void sell(Human buyer, Human seller, Double price) {
        if (buyer.cash > price) {
            if (seller.getCarBool()) {

                buyer.cash -= price;
                seller.cash += price;
                buyer.soldCar(this);
                seller.soldCar(null);
                System.out.println("Transakcja została dokonana.");

            } else {
                System.out.println("Sprzedający nie posiada samochodu na sprzedaż.");
            }
        } else {
            System.out.println("Nie stać cię.");
        }
    }

    public abstract void reFuel();
}
