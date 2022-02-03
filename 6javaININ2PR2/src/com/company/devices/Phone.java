package com.company.devices;

import com.company.creatures.Human;
import com.company.creatures.Saleable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;

public class Phone extends Device implements Saleable {
    private static final String DEFAULT_VERSION_NAME = "V1.0";
    private static final String DEFAULT_SERVER_NAME = "wsb.gda.pl";
    private static final String DEFAULT_PROTOCOL_NAME = "https";
    public Double screensize;
    public String os;
    public Integer year;
    HashSet<Application> appGroup = new HashSet<>();

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) {
        if (buyer.cash > price) {
            if (seller.mobile != null) {

                buyer.cash -= price;
                seller.cash += price;
                buyer.mobile = this;
                seller.mobile = null;
                System.out.println("Transakcja została dokonana.");
            } else System.out.println("Sprzedający nie posiada telefonu na sprzedaż.");
        } else {
            System.out.println("Nie stać cię.");
        }
    }


    public String toString() {
        return "Producent i model: " + producer + " " + model + "; przekątna ekranu (w calach): " + screensize + "; system operacyjny: " + os + "; rok produkcji: " + year;
    }

    public void turnOn() {
        System.out.println("Przytrzymuję przycisk włączania.");
    }

    public void installAnApp(String appName) {
        System.out.println("Instaluję aplikację " + appName);
        this.installAnApp(appName, DEFAULT_VERSION_NAME);
    }

    public void installAnApp(String appName, String version) {
        System.out.println("Instaluję aplikację " + appName);
        this.installAnApp(appName, version, DEFAULT_SERVER_NAME);
    }

    public void installAnApp(String appName, String version, String server) {
        URL url = null;
        try {
            url = new URL(DEFAULT_PROTOCOL_NAME, server, 443, appName + "-" + version);
        } catch (MalformedURLException e) {
            System.out.println("Przykro mi, podany adres nie istnieje.");
            e.printStackTrace();
        }
        this.installAnApp(url);
    }

    public void installAnApp(List<String> appNames) {
        for (String appName : appNames) {
            this.installAnApp(appName);
        }
    }

    public void installAnApp(URL url) {
        //logika - sprawdzić miejsce na telefonie, czy apka jest płatna, obsługa płatności, ...
        //...kontrola rodzicielska, obsługa błędów, pobranie, rozpakowanie, instalacja, dodanie ikony.
    }

    public void appInstallation (Human phoneOwner, Application app)
    {
        if (phoneOwner.cash<app.price) {System.out.println("Osoba nie posiada wystarczającej ilości pieniędzy potrzebnych do zakupu aplikacji.");return;}
        appGroup.add(app);
        phoneOwner.cash-=app.price;
        System.out.println("Aplikacja "+app.appName+" zakupiona i zainstalowana.");
    }

}
