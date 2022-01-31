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
        if (buyer.cash > price) {
            if (seller.mobile != null){

                buyer.cash -= price;
                seller.cash += price;
            buyer.mobile = this;
            seller.mobile = null;
            System.out.println("Transakcja została dokonana.");
            }
            else System.out.println("Sprzedający nie posiada telefonu na sprzedaż.");
        } else {
            System.out.println("Nie stać cię.");
        }
    }


    public String toString() {
        return "Producent i model: "+producer+ " " + model+"; przekątna ekranu (w calach): "+screensize+"; system operacyjny: "+os+"; rok produkcji: "+year;
    }

    public void turnOn() {
        System.out.println("Przytrzymuję przycisk włączania.");
    }

}
