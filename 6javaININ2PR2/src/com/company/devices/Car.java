package com.company.devices;

import com.company.creatures.Human;

import java.util.ArrayList;

public abstract class Car extends Device {
    Double mileage;
    public Double value;
    public Double fuelTankCapacity;
    public Double fuel;
    public ArrayList owners = new ArrayList();

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

    public int hasThisCar(Human sellingPerson) {
        for (int i = 0; i < sellingPerson.garage.length; i++) {
            if (sellingPerson.garage[i] == this) return i;
        }
        return -1;
    }

    public int hasEmptyGarageSpace(Human buyingPerson) {
        for (int i = 0; i < buyingPerson.garage.length; i++) {
            if (buyingPerson.garage[i] == null) return i;
        }
        return -1;
    }


    @Override
    public void sell(Human buyer, Human seller, Double price) {
        if (this.hasThisCar(seller) == -1) {
            System.out.println("Sprzedawca nie posiada tego samochodu w garażu.");
            return;
        }
        if (this.wasAnOwner(seller)==false) {
            System.out.println("Sprzedawca nie jest wpisany jako ostatni właściciel tego pojazdu.");
            return;
        }
        if (this.hasEmptyGarageSpace(buyer) == -1) {
            System.out.println("Kupujący nie posiada miejsca w garażu.");
            return;
        }
        if (price > buyer.cash) {
            System.out.println("Kupujący nie posiada wystarczającej ilości gotówki.");
            return;
        }
        buyer.soldCar(hasEmptyGarageSpace(buyer), this);
        seller.soldCar(hasThisCar(seller), null);
        buyer.cash -= price;
        seller.cash += price;
        this.owners.add(buyer);
        System.out.println("Transakcja została dokonana.");
    }

    public abstract void reFuel();

    public boolean wasAnOwner(Human holder)
    {
        if (this.owners.size()==0) return false;
        for (int i=0;i<this.owners.size();i++)
        {
            if (this.owners.get(i)==holder) return true;
        }
        return false;
    }

    public void transactionCheck (Human buyer, Human seller){
        if (this.owners.size()<2) {System.out.println("Nie, człowiek podany jako sprzedawca nie sprzedał tego samochodu człowiekowi podanemu jako kupujący.");return;}
        for (int i=0;i<this.owners.size()-1;i++)
        {
            if (this.owners.get(i)==seller && this.owners.get(i+1)==buyer) {System.out.println("Tak, człowiek podany jako sprzedawca sprzedał ten samochód człowiekowi podanemu jako kupujący.");return;}
        }
        System.out.println("Nie, człowiek podany jako sprzedawca nie sprzedał tego samochodu człowiekowi podanemu jako kupujący.");
    }

    public void transactionCount()
    {
        if (this.owners.size()<2) {System.out.println("Ilość transakcji sprzedaży podanego samochodu: 0.");return;}
        else System.out.println("Ilość transakcji sprzedaży podanego samochodu: "+ (this.owners.size()-1)+".");
    }
}
