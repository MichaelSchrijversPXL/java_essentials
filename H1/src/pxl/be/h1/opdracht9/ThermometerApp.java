package pxl.be.h1.opdracht9;

import java.util.Scanner;

public class ThermometerApp {
    static void main(String[] args) {
        Thermometer thermometer = new Thermometer();
        Scanner input = new Scanner(System.in);
        System.out.println("geef de temperatuur in:");
        double temp = input.nextDouble();
        thermometer.setTemperatuur(temp);
        System.out.println("in fahrenheit: " + thermometer.getFahrenheit());
    }
}
