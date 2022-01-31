package com.company;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Phone samsung = new Phone ("Samsung", "Galaxy", 2019);
        samsung.screensize = 5.6;
        samsung.os = "Android 9";

        Car fiat = new Car("Fiat", "Multipla", 2005);
        fiat.value = 2500.00;
     //   fiat.mileage = 223790.1;

        Car mini = new Car("Mini", "Cooper", 2010);
        mini.value=20000.00;

        Car mini2 = new Car("Mini", "Cooper", 2010);
        mini2.value=20000.00;


        Car lambo = new Car("Lamborghini", "Huracan", 2019);
        lambo.value=999999.99;

        Car polonez = new Car("FSO", "Polonez", 1999);

        fiat.drive(12.3);

        System.out.println("Przebieg Fiata wynosi " + fiat.getMileage() + " km.");

        Pet dog = new Pet ("canis");
        dog.name = "Azor";
        System.out.println(dog.introduceYourself());

        dog.feed();
        dog.walk();dog.walk();dog.walk();dog.walk();
        dog.walk();dog.walk();dog.walk();dog.walk();
        dog.walk();dog.walk();dog.walk();dog.walk();
        System.out.println(dog.introduceYourself());

        Human marian = new Human();
        marian.firstName = "Marian";
        marian.lastName = "Kowalski";
        marian.pet = dog;
        marian.age = 57;
        marian.mobile =samsung;

        marian.pet.feed();

        marian.getSalary();
        marian.setSalary(-1);
        marian.setSalary(2801.4);

        marian.getCar();
        marian.setCar(lambo);
        marian.getCar();
        marian.setCar(mini);
        marian.getCar();
        marian.setCar(fiat);
        marian.getCar();


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
        marian.automobile.turnOn();
        System.out.println();System.out.println();System.out.println();

        marian.cash = 0.0;

        Human grzegorz = new Human();
        grzegorz.firstName = "Grzegorz";
        grzegorz.lastName = "Nowak";
        grzegorz.age = 57;
        grzegorz.cash = 650.0;

        System.out.println(marian.firstName+" "+marian.getCarBool()+" "+marian.mobile +" "+marian.pet+" "+marian.cash);
        System.out.println(grzegorz.firstName+" "+grzegorz.getCarBool()+" "+grzegorz.mobile +" "+grzegorz.pet+" "+grzegorz.cash);
        System.out.println();System.out.println();System.out.println();
        dog.sell(grzegorz, marian, 200.0);
        samsung.sell(grzegorz, marian, 300.0);
        fiat.sell(grzegorz, marian, 100.0);
        // marian.pet = grzegorz;                (klasa Human nie może być klasą Pet - błąd kompilacji)
        grzegorz.sell(grzegorz, marian, 25.0);

        System.out.println();System.out.println();System.out.println();
        System.out.println(marian.firstName+" "+marian.getCarBool()+" "+marian.mobile +" "+marian.pet+" "+marian.cash);
        System.out.println(grzegorz.firstName+" "+grzegorz.getCarBool()+" "+grzegorz.mobile +" "+grzegorz.pet+" "+grzegorz.cash);

        Pet piechu = new Pet ("canis");

        piechu.name = "Reks";
        System.out.println(piechu.weight);
        piechu.feed(4.0);
        System.out.println(piechu.weight);
    }








}

//ctrl+alt+L - formatowanie tekstu
//ctrl+D - kopiowanie linii
//ctrl+W - zaznaczanie obszaru (coraz większego z każdym powtórzeniem skrótu)