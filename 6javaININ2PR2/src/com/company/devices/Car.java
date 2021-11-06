package com.company.devices;

public class Car {
    public String producer;
    public final String model;
    public Integer age;
    private Double mileage;
    public Double value;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
        this.mileage=0.0;
    }

    public String toString() {
        return "Producent i model: "+producer+ " " + model+"; wiek (w latach): "+age+"; przebieg (w km): "+mileage+"; wartość/cena (w zł): "+value;
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

        if (producer.equals(other.producer) && model.equals(other.model) && age.equals(other.age)&&value.equals(other.value)&&mileage.equals(other.mileage))
            return true;
        else return false;

    }



}
