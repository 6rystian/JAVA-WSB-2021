package com.company;

public class Main {

    public static void main(String[] args) {
        Car fiat = new Car("Fiat", "Multipla");
        fiat.age = 17;
        fiat.value = 2500.00;
     //   fiat.mileage = 223790.1;
        fiat.manualGear = true;

        Car mini = new Car("Mini", "Cooper");
        mini.age=11;
        mini.value=20000.00;

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
        marian.automobile = fiat;

        marian.pet.feed();
        System.out.println(marian.automobile.model);

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
    }


}

//ctrl+alt+L - formatowanie tekstu
//ctrl+D - kopiowanie linii
//ctrl+W - zaznaczanie obszaru (coraz większego z każdym powtórzeniem skrótu)