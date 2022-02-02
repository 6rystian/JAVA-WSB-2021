package com.company.devices;

import com.company.creatures.Saleable;

public abstract class Device implements Saleable {
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer=producer;
        this.model=model;
        this.yearOfProduction=yearOfProduction;
    }

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    abstract public void turnOn();



}
