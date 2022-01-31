package com.company;

public class Animal implements Saleable {
    String name;
    final String species;
    Integer age;
    Double weight;
    Boolean alive;

    Animal(String species) {
        this.species = species;
        this.alive = true;

        if (this.species == "canis") {
            this.weight = 10.0;
        } else if (this.species == "felis") {
            this.weight = 2.0;
        } else if (this.species == "homo sapiens") {
            this.weight = 99.0;
        } else {
            this.weight = 1.0;
        }
    }

    public String toString() {
        return "imię: "+name + "; gatunek: " + species;
    }

        void feed() {
        if (this.alive == false) {
            System.out.println("Martwego zwierzaka raczej nie wypycha się jedzeniem. Spróbuj z watą i drutami.");
        } else {
            this.weight += 1;
            System.out.println("Nowa waga: " + this.weight + " kg.");
        }
    }

    void walk() {
        if (this.alive == false) {
            System.out.println("Martwy zwierzak wyprowadzany na spacer? Pomysłowe.");
        } else {
            this.weight -= 1;
            System.out.println("Nowa waga zwierzęcia: " + this.weight + " kg.");
            if (weight <= 0) this.alive = false;
        }
    }

    void kill() {
        this.alive = false;
    }

    String introduceYourself() {
        String output = "...";
        if (this.alive == true) output = "Nazywam się " + name + ", a mój gatunek to " + species + ".";
        return output;
    }


    @Override
    public void sell(Human buyer, Human seller, Double price) {
        if (buyer.cash > price) {
            if (seller.pet != null){
                 if (seller.pet instanceof Human == false){

                    buyer.cash -= price;
                    seller.cash += price;
                    buyer.pet = this;
                    seller.pet = null;
                    System.out.println("Transakcja została dokonana.");
                }
                else System.out.println("Handel ludźmi jest niedozwolony.");
            }
            else System.out.println("Sprzedający nie posiada zwierzaka na sprzedaż.");
        } else {
            System.out.println("Nie stać cię.");
        }
    }
}
