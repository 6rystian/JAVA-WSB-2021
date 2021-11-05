package com.company;

public class Car {
    String producer;
    final String model;
    Integer age;
    private Double mileage;
    Double value;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
        this.mileage=0.0;
    }

    public String toString() {
        return "Producent i model: "+producer+ " " + model+"; wiek (w latach): "+age+"; przebieg (w km): "+mileage+"; wartość/cena (w zł): "+value;
    }

    void drive(Double distance){
        mileage += distance;
    }

    Double getMileage()
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

        if (producer == null) {
            if (other.producer != null)
                return false;
        } else if (!producer.equals(other.producer))
            return false;

        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;

        if (age == null) {
            if (other.age != null)
                return false;
        } else if (!age.equals(other.age))
            return false;

        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;

        if (mileage == null) {
            if (other.mileage != null)
                return false;
        } else if (!mileage.equals(other.mileage))
            return false;

        return true;

    }



}
