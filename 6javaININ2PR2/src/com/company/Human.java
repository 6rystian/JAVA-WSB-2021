package com.company;

// import java.time.ZonedDateTime;
import java.util.Date;


public class Human {
    String firstName;
    String lastName;
    Integer age;
    Double weight;
    Animal pet;
    Car automobile;
    private Double salary = 2800.0;

    void getSalary() {
      //  System.out.println("Data i godzina: " + ZonedDateTime.now());
        System.out.println("Data i godzina: " + new Date());
        System.out.println("Wartość wypłaty: " + this.salary);
    }

    void setSalary(double sal){
        if (sal<0){ System.out.println("Wypłata nie może mieć wartości ujemnej.");}
        else{
            System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
            System.out.println("Przypominamy o konieczności odebrania aneksu do umowy od pani Hani z kadr.");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty, próby ukrycia dochodu będą daremne.");
            this.salary = sal;
        }
    }
}
