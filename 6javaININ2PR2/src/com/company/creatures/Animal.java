package com.company.creatures;

public abstract class Animal implements Saleable, Feedable {
    public String name;
    public final String species;
    public Integer age;
    public Double weight;
    public Boolean alive;

    public Animal(String species) {
        this.species = species;
        this.alive = true;

        switch (this.species) {
            case "canis":
                this.weight = 10.0;
                break;
            case "felis":
                this.weight = 2.0;
                break;
            case "homo sapiens":
                this.weight = 99.0;
                break;
            default:
                this.weight = 1.0;
                break;
        }
    }

    public String toString() {
        return "imię: "+name + "; gatunek: " + species;
    }



    public void walk() {
        if (!this.alive) {
            System.out.println("Martwy zwierzak wyprowadzany na spacer? Pomysłowe.");
        } else {
            this.weight -= 1;
            System.out.println("Nowa waga zwierzęcia: " + this.weight + " kg.");
            if (weight <= 0) this.alive = false;
        }
    }

    public void kill() {
        this.alive = false;
    }

    public String introduceYourself() {
        String output = "...";
        if (this.alive) output = "Nazywam się " + name + ", a mój gatunek to " + species + ".";
        return output;
    }


    @Override
    public void sell(Human buyer, Human seller, Double price) {
        if (buyer.cash > price) {
            if (seller.pet != null){

                    buyer.cash -= price;
                    seller.cash += price;
                    buyer.pet = seller.pet;
                    seller.pet = null;
                    System.out.println("Transakcja została dokonana.");
                }

            else System.out.println("Sprzedający nie posiada zwierzaka na sprzedaż.");
        } else {
            System.out.println("Nie stać cię.");
        }
    }

    @Override
    public void feed() {
        if (!this.alive) {
            System.out.println("Martwego zwierzaka raczej nie wypycha się jedzeniem. Spróbuj z watą i drutami.");
        } else {
            this.weight += 1;
            System.out.println("Nowa waga: " + this.weight + " kg.");
        }
    }

    public void feed(Double foodWeight){
        if (this.alive) this.weight += foodWeight;
    }

}
