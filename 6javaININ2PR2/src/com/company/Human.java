package com.company;

// import java.time.ZonedDateTime;
import java.util.Date;


public class Human {
    String firstName;
    String lastName;
    Integer age;
    Animal pet;
    private Car automobile;
    private Double salary = 2800.0;

    public String toString() {
        return "Imię i nazwisko: "+firstName+ " " +lastName+"; wiek (w latach): "+age+"; zwierzę domowe: ["+pet+"]; samochód: ["+automobile+"]";
    }

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

    void getCar()
    {
        if (this.automobile == null) {System.out.println("Ta osoba nie posiada samochodu (lub ukrywa ten fakt).");}
        else {System.out.println("Samochód (domniemanie) posiadany przez tego człowieka to: "+this.automobile.producer+" "+this.automobile.model);}
    }
    void setCar(Car whip){
        if (whip.value>(12*this.salary)) {System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę. Samochód "+whip.producer+" "+whip.model+" nieprzypisany.");}
        else{
            if (whip.value>this.salary) {System.out.println("Udało się zakupić samochód na kredyt. Samochód "+whip.producer+" "+whip.model+" nieprzypisany."); this.automobile = whip;}
            else {System.out.println("Udało się zakupić samochód gotówką. Samochód "+whip.producer+" "+whip.model+" nieprzypisany."); this.automobile = whip;}
        }
    }
}
