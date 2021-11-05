package com.company;

public class Car {
    String producer;
    final String model;
    Integer age;
    private Double mileage;
    Boolean manualGear;
    Double value;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
        this.mileage=0.0;
    }

    void drive(Double distance){
        mileage += distance;
    }

    Double getMileage()
    {
        return this.mileage;
    }


}
