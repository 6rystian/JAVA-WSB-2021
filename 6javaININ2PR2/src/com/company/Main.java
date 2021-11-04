package com.company;

public class Main {

    public static void main(String[] args) {
        Car fiat = new Car("Fiat", "Multipla");
        fiat.age = 6;
     //   fiat.mileage = 223790.1;
        fiat.manualGear = true;

        Car mini = new Car("Mini", "Cooper");

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
        marian.automobile = fiat;

        marian.pet.feed();
        System.out.println(marian.automobile.model);

        marian.getSalary();
        marian.setSalary(-1);
        marian.setSalary(2801.4);
    }


}

//ctrl+alt+L - formatowanie tekstu
//ctrl+D - kopiowanie linii
//ctrl+W - zaznaczanie obszaru (coraz większego z każdym powtórzeniem skrótu)