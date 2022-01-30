package com.company.devices;

import com.company.Device;
import com.company.Human;
import com.company.Saleable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device implements Saleable {
    private static final String DEFAULT_VERSION_NAME = "V1.0";
    private static final String DEFAULT_SERVER_NAME = "wsb.gda.pl";
    private static final String DEFAULT_PROTOCOL_NAME = "https";
    public Double screensize;
    public String os;
    public Integer year;

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) {
        if (buyer.getSalary() > price) {
            buyer.mobile = this;
            seller.mobile = null;
            seller.cash += price;
            buyer.cash -= price;
        } else {
            System.out.println("nie stać cię");
        }
    }


    public String toString() {
        return "Producent i model: "+producer+ " " + model+"; przekątna ekranu (w calach): "+screensize+"; system operacyjny: "+os+"; rok produkcji: "+year;
    }

    public void turnOn() {
        System.out.println("sus");
    }

    public void installAnApp(String appName){
        System.out.println("Instaluję aplikację "+appName);
        this.installAnApp(appName, DEFAULT_VERSION_NAME);
    }

    public void installAnApp(String appName, String version){
        System.out.println("Instaluję aplikację "+appName);
        this.installAnApp(appName, version, DEFAULT_SERVER_NAME);
    }

    public void installAnApp(String appName, String version, String server){
        URL url = null;
        try {
            url = new URL(DEFAULT_PROTOCOL_NAME, server, 443, appName + "-" + version);
        } catch (MalformedURLException e) {
            System.out.println("Przykro mi, podany adres nie istnieje.");
            e.printStackTrace();
        }
        this.installAnApp(url);
    }

    public void installAnApp(List<String> appNames){
        for (String appName : appNames) {
            this.installAnApp(appName);
        }
    }

    public void installAnApp(URL url){
        //logika - sprawdzić miejsce na telefonie, czy apka jest płatna, obsługa płatności, ...
        //...kontrola rodzicielska, obsługa błędów, pobranie, rozpakowanie, instalacja, dodanie ikony.
    }
}
