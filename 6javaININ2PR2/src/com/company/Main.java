package com.company;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Phone samsung = new Phone ("Samsung", "Galaxy M22");
        samsung.price = 999.00;

        Car fiat = new Car("Fiat", "Multipla");
        fiat.age = 17;
        fiat.value = 2500.00;
     //   fiat.mileage = 223790.1;

        Car mini = new Car("Mini", "Cooper");
        mini.age=11;
        mini.value=20000.00;

        Car mini2 = new Car("Mini", "Cooper");
        mini2.age=11;
        mini2.value=20000.00;


        Car lambo = new Car("Lamborghini", "Huracan");
        lambo.age=5;
        lambo.value=999999.99;

        Car polonez = new Car("FSO", "Polonez");

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


        if (mini.equals(mini2)==true) System.out.println("Podane samochody mają taką samą specyfikację.");
        if (mini.equals(fiat)==true) System.out.println("Podane samochody mają taką samą specyfikację.");

        System.out.println(dog);
        System.out.println(mini);
        System.out.println(mini2);
        System.out.println(fiat);
        System.out.println(marian);
    }








}

//ctrl+alt+L - formatowanie tekstu
//ctrl+D - kopiowanie linii
//ctrl+W - zaznaczanie obszaru (coraz większego z każdym powtórzeniem skrótu)