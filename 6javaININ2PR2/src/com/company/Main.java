package com.company;
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

        Animal dog = new Animal("canis");
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
        marian.telephone=samsung;

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

        marian.telephone.turnOn();
        marian.automobile.turnOn();
        //Device pralka = new Device("Bosch", "WAU2400PL", 2021);

    }








}

//ctrl+alt+L - formatowanie tekstu
//ctrl+D - kopiowanie linii
//ctrl+W - zaznaczanie obszaru (coraz większego z każdym powtórzeniem skrótu)