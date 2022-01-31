package com.company.devices;

import com.company.Human;
import com.company.Saleable;

public class Phone extends Device implements Saleable {
    public Double screensize;
    public String os;
    public Integer year;

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) {
        if (buyer.getSalary() > price) {
            buyer.mobile = this;
            seller.mobile = null;
            seller.cash += price;
            buyer.cash -= price;
        } else {
            System.out.println("nie stać cię");
        }
    }


    public String toString() {
        return "Producent i model: "+producer+ " " + model+"; przekątna ekranu (w calach): "+screensize+"; system operacyjny: "+os+"; rok produkcji: "+year;
    }

    public void turnOn() {
        System.out.println("Przytrzymuję przycisk włączania.");
    }

}
