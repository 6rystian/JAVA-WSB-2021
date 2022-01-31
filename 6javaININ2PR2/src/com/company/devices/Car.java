package com.company.devices;

public class Car extends Device {
    private Double mileage;
    public Double value;

    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.mileage=0.0;
    }

    public void turnOn() {
        System.out.println("Przekręcam kluczyk.");
    }

    public String toString() {
        return "Producent i model: "+producer+ " " + model+"; rok produkcji: "+yearOfProduction+"; przebieg (w km): "+mileage+"; wartość/cena (w zł): "+value;
    }

    public void drive(Double distance){
        mileage += distance;
    }

    public Double getMileage()
    {
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

        if (producer.equals(other.producer) && model.equals(other.model) && yearOfProduction.equals(other.yearOfProduction)&&value.equals(other.value)&&mileage.equals(other.mileage))
            return true;
        else return false;

    }



}
