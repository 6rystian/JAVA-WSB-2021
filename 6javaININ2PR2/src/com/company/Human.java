package com.company;

// import java.time.ZonedDateTime;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;


public class Human extends Animal{
    public static final String HUMAN_SPECIES = "homo sapiens";
    public static final Double DEFAULT_SALARY = 1000.0;
    private static final int DEFAULT_GARAGE_SIZE = 3;

    String firstName;
    String lastName;
    Integer age;
    Animal pet;
    Phone telephone;
    private Double salary;
    public Phone mobile;
    public Double cash;
    private Car[] garage;

    public Human(){
        super(HUMAN_SPECIES);
        this.salary = DEFAULT_SALARY;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    Human (Integer garageSize)
    {
        super(HUMAN_SPECIES);
        this.salary = DEFAULT_SALARY;
        this.garage = new Car[garageSize];
    }


    public String toString() {
        return "Imię i nazwisko: "+firstName+ " " +lastName+"; wiek (w latach): "+age+"; zwierzę domowe: ["+pet+"]; telefon: ["+telephone+"]; samochody: ["+garage+"]";
    }

    public Double getSalary() {
      //  System.out.println("Data i godzina: " + ZonedDateTime.now());
        System.out.println("Data i godzina: " + new Date());
        System.out.println("Wartość wypłaty: " + this.salary);
        return this.salary;
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

//    void getCar()
 //   {
 //       if (this.automobile == null) {System.out.println("Ta osoba nie posiada samochodu (lub ukrywa ten fakt).");}
 //       else {System.out.println("Samochód (domniemanie) posiadany przez tego człowieka to: "+this.automobile.producer+" "+this.automobile.model);}
 //   }
//    void setCar(Car whip){
  //      if (whip.value>(12*this.salary)) {System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę. Samochód "+whip.producer+" "+whip.model+" nieprzypisany.");}
 //       else{
 //           if (whip.value>this.salary) {System.out.println("Udało się zakupić samochód na kredyt. Samochód "+whip.producer+" "+whip.model+" nieprzypisany."); this.automobile = whip;}
 //           else {System.out.println("Udało się zakupić samochód gotówką. Samochód "+whip.producer+" "+whip.model+" nieprzypisany."); this.automobile = whip;}
 //       }
 //   }

    void setCar(Car newCar, Integer parkingLotNumber){
        if (this.salary>newCar.value){
            this.garage[parkingLotNumber]=newCar;
            System.out.println("Kupiony za gotówkę, gratulacje!");
        } else if (this.salary > newCar.value / 12) {
            this.garage[parkingLotNumber]=newCar;
            System.out.println("Kupiony na raty.");
        } else{
            System.out.println("Nie ma hajsu...");
            System.out.println("...nie ma samochodu.");
        }
    }
    Car getCar (Integer parkingLotNumber){
        return this.garage[parkingLotNumber];
    }
}
