package com.company.devices;

public class Phone {
    final String producer;
    final String model;
    public Double price;

    public Phone(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }
    public String toString() {
        return "Producent i model: "+producer+ " " + model+"; cena (w zł): "+price;
    }

}
