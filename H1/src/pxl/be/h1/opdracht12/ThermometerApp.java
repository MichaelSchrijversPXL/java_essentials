package pxl.be.h1.opdracht12;

import java.util.Scanner;

public class ThermometerApp {
    static void main(String[] args) {
        Thermometer thermometer = new Thermometer();
        System.out.printf("|%10s|%10s|%n", "Celsius", "Fahrenheit");
        for (double temp = -10; temp <= 25; temp += 5){
            thermometer.setTemperatuur(temp);
            System.out.printf("|%10.1f|%10.1f|%n", temp, thermometer.getFahrenheit());
        }

        for (double temp = -10; temp < 10; temp += 0.5){
            thermometer.setTemperatuur(temp);
            System.out.printf("|%10.1f|%10.1f|%n", temp, thermometer.getFahrenheit());
        }
    }
}
