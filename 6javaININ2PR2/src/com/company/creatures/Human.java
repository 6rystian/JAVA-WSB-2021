package com.company.creatures;

// import java.time.ZonedDateTime;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;


public class Human extends Animal {
    public static final String HUMAN_SPECIES = "homo sapiens";
    public static final Double DEFAULT_SALARY = 1000.0;
    private static final int DEFAULT_GARAGE_SIZE = 3;

    public String firstName;
    public String lastName;
    public Integer age;
    public Pet pet;
    public Car[] garage;
    public Phone mobile;
    private Double salary;
    public Double cash;

    public Human() {
        super(HUMAN_SPECIES);
        this.salary = DEFAULT_SALARY;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(Integer garageSize) {
        super(HUMAN_SPECIES);
        this.salary = DEFAULT_SALARY;
        this.garage = new Car[garageSize];
    }

    public String toString() {
        return "Imię i nazwisko: " + firstName + " " + lastName + "; wiek (w latach): " + age + "; zwierzę domowe: [" + pet + "]; telefon: [" + mobile + "]; samochody: [" + garage + "]";
    }

    public Double getSalary() {
        //  System.out.println("Data i godzina: " + ZonedDateTime.now());
        System.out.println("Data i godzina: " + new Date());
        System.out.println("Wartość wypłaty: " + this.salary);
        return this.salary;
    }

    public void setSalary(double sal) {
        if (sal < 0) {
            System.out.println("Wypłata nie może mieć wartości ujemnej.");
        } else {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
            System.out.println("Przypominamy o konieczności odebrania aneksu do umowy od pani Hani z kadr.");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty, próby ukrycia dochodu będą daremne.");
            this.salary = sal;
        }
    }


    public boolean getCarBool(Integer parkingLotNumber) {
        if (this.getCar(parkingLotNumber) == null) return false;
        else return true;
    }

    public boolean isNotNull(Object obj) {
        if (obj == null)
            return false;
        else return true;
    }

    public void getCarDescription(Integer parkingLotNumber) {
        if (this.garage[parkingLotNumber - 1] == null) {
            System.out.println("Samochód na miejscu parkingowym " + parkingLotNumber + ": brak");
        } else {
            System.out.println("Samochód na miejscu parkingowym " + parkingLotNumber + ": " + this.garage[parkingLotNumber - 1].producer + " " + this.garage[parkingLotNumber - 1].model + " " + this.garage[parkingLotNumber - 1].yearOfProduction);
        }
    }
//    void setCar(Car whip){
    //      if (whip.value>(12*this.salary)) {System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę. Samochód "+whip.producer+" "+whip.model+" nieprzypisany.");}
    //       else{
    //           if (whip.value>this.salary) {System.out.println("Udało się zakupić samochód na kredyt. Samochód "+whip.producer+" "+whip.model+" nieprzypisany."); this.automobile = whip;}
    //           else {System.out.println("Udało się zakupić samochód gotówką. Samochód "+whip.producer+" "+whip.model+" nieprzypisany."); this.automobile = whip;}
    //       }
    //   }

    public void setCar(Car newCar, Integer parkingLotNumber) {
        if (this.salary > newCar.value) {
            this.garage[parkingLotNumber] = newCar;
            System.out.println("Kupiony za gotówkę, gratulacje!");
        } else if (this.salary > newCar.value / 12) {
            this.garage[parkingLotNumber] = newCar;
            System.out.println("Kupiony na raty.");
        } else {
            System.out.println("Nie ma hajsu...");
            System.out.println("...nie ma samochodu.");
        }
    }

    public Car getCar(Integer parkingLotNumber) {
        return this.garage[parkingLotNumber];
    }

    public Double getGarageValue() {
        Double x = 0.0;
        if (isNotNull(this.garage) == false) return x;

        for (int i = 0; i < this.garage.length; i++) {
            if (isNotNull(this.garage[i]) == true) x += this.garage[i].value;


        }
        return x;
    }

    public void sortGarage() {
        Car swapper;
        Integer emptyGarageSpaces = 0;
        for (int i = 0; i < this.garage.length - emptyGarageSpaces; i++) {
            if (isNotNull(this.garage[i]) == false) {
                swapper = this.garage[i];
                this.garage[i] = this.garage[this.garage.length - 1 - emptyGarageSpaces];
                this.garage[this.garage.length - 1 - emptyGarageSpaces] = swapper;
                emptyGarageSpaces += 1;
                i -= 1;
            }
        }
        Integer x = 0;
        do {
            x = 0;
            for (int i = 0; i < (this.garage.length - 1 - emptyGarageSpaces); i++) {
                if (this.garage[i].yearOfProduction > this.garage[i + 1].yearOfProduction) {
                    swapper = this.garage[i];
                    this.garage[i] = this.garage[i + 1];
                    this.garage[i + 1] = swapper;
                    x += 1;
                }
            }

        } while (x > 0);
    }

    public void soldCar(Integer parkingLotNumber, Car whip) {
        this.garage[parkingLotNumber] = whip;
    }


}
