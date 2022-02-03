package com.company;

import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) {
        Phone samsung = new Phone("Samsung", "Galaxy", 2019);
        samsung.screensize = 5.6;
        samsung.os = "Android 9";

        Diesel fiat = new Diesel("Fiat", "Multipla", 2005);
        fiat.value = 2500.00;
        //   fiat.mileage = 223790.1;

        Diesel mini = new Diesel("Mini", "Cooper", 2010);
        mini.value = 20000.00;

        Diesel mini2 = new Diesel("Mini", "Cooper", 2010);
        mini2.value = 20000.00;


        Electric tesla = new Electric("Tesla", "S", 2014);
        tesla.value = 160000.00;

        LPG opel = new LPG("Opel", "Astra", 1996);
        opel.value = 1600.00;

        fiat.drive(12.3);

        System.out.println("Przebieg Fiata wynosi " + fiat.getMileage() + " km.");

        Pet dog = new Pet("canis");
        dog.name = "Azor";
        dog.age = 5;
        System.out.println(dog.introduceYourself());

        dog.feed();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        System.out.println(dog.introduceYourself());

        Human marian = new Human();
        marian.firstName = "Marian";
        marian.lastName = "Kowalski";
        marian.pet = dog;
        marian.age = 57;
        marian.mobile = samsung;

        marian.pet.feed();

        marian.getSalary();
        marian.setSalary(-1);
        marian.setSalary(2801.4);

        marian.getCar(1);
        marian.getCar(2);
        marian.getCar(0);
        marian.setCar(tesla, 1);
        marian.setCar(mini, 2);
        marian.setCar(fiat, 0);
        marian.getCar(1);
        System.out.println(marian.getCar(0));
        marian.getCar(2);
        marian.getCar(0);


        if (mini.equals(mini2)) System.out.println("Podane samochody mają taką samą specyfikację.");
        if (mini.equals(fiat)) System.out.println("Podane samochody mają taką samą specyfikację.");

        System.out.println(dog);
        System.out.println(mini);
        System.out.println(mini2);
        System.out.println(fiat);
        System.out.println(marian);

        System.out.println(marian.species);
        System.out.println(marian.weight);
        marian.feed();
        System.out.println(marian.weight);

        marian.mobile.turnOn();
        marian.getCar(0).turnOn();
        System.out.println();
        System.out.println();
        System.out.println();

        marian.cash = 0.0;

        Human grzegorz = new Human();
        grzegorz.firstName = "Grzegorz";
        grzegorz.lastName = "Nowak";
        grzegorz.age = 57;
        grzegorz.cash = 650.0;

        System.out.println(marian.firstName + " " + marian.getCarBool(0) + " " + marian.getCarBool(1) + " " + marian.getCarBool(2) + " " + marian.mobile + " " + marian.pet + " " + marian.cash);
        System.out.println(grzegorz.firstName + " " + grzegorz.getCarBool(0) + " " + grzegorz.getCarBool(1) + " " + grzegorz.getCarBool(2) + " " + grzegorz.mobile + " " + grzegorz.pet + " " + grzegorz.cash);
        System.out.println();
        System.out.println();
        System.out.println();
        //       dog.sell(grzegorz, marian, 200.0);
        //   samsung.sell(grzegorz, marian, 300.0);
        //   fiat.sell(grzegorz, marian, 100.0);
        // marian.pet = grzegorz;                (klasa Human nie może być klasą Pet - błąd kompilacji)
        //   grzegorz.sell(grzegorz, marian, 25.0);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(marian.firstName + " " + marian.getCarBool(0) + " " + marian.getCarBool(1) + " " + marian.getCarBool(2) + " " + marian.mobile + " " + marian.pet + " " + marian.cash);
        System.out.println(grzegorz.firstName + " " + grzegorz.getCarBool(0) + " " + grzegorz.getCarBool(1) + " " + grzegorz.getCarBool(2) + " " + grzegorz.mobile + " " + grzegorz.pet + " " + grzegorz.cash);

        Pet piechu = new Pet("canis");

        piechu.name = "Reks";
        System.out.println(piechu.weight);
        piechu.feed(4.0);
        System.out.println(piechu.weight);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println(mini2.fuel + " " + mini2.getMileage());
        mini2.drive(1.0);
        mini2.reFuel();
        mini2.drive(1.0);
        System.out.println(mini2.fuel + " " + mini2.getMileage());

        marian.getGarageValue();

        Human pietras = new Human(5);
        pietras.cash = 1000000.0;
        pietras.setSalary(1000000.0);
        pietras.setCar(tesla, 1);
        pietras.setCar(mini, 3);
        pietras.setCar(fiat, 0);
        pietras.setCar(opel, 4);

        for (int i = 1; i <= pietras.garage.length; i++) {
            pietras.getCarDescription(i);
        }

        pietras.sortGarage();
        System.out.println();
        for (int i = 1; i <= pietras.garage.length; i++) {
            pietras.getCarDescription(i);
        }
        marian.setCar(opel, 1);
        System.out.println();
        System.out.println();

        mini2.sell(marian, pietras, 15000.0);
        pietras.setCar(mini2, 4);
        mini2.sell(marian, pietras, 15000.0);
        marian.soldCar(1, null);
        mini2.sell(marian, pietras, 15000.0);
        marian.cash += 15001.0;
        mini2.sell(marian, pietras, 15000.0);


    }


}

//ctrl+alt+L - formatowanie tekstu
//ctrl+D - kopiowanie linii
//ctrl+W - zaznaczanie obszaru (coraz większego z każdym powtórzeniem skrótu)