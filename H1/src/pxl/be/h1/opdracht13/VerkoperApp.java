package pxl.be.h1.opdracht13;

import java.util.Scanner;

public class VerkoperApp {
    static void main(String[] args) {
        Verkoper verkoper = new Verkoper();
        verkoper.setNaam("Joeri Gerrits");
        verkoper.setVerkoopMaand(1,1025.26);
        System.out.printf("%s heeft voor $%.0f verkocht %n", verkoper.getNaam(), verkoper.getTotaalVerkocht());
        Scanner scanner = new Scanner(System.in);
        System.out.println("geef de verkoopcijfers van het laatste jaar in:");
        for (int i = 1; i< 12; i++){
            double bedrag = scanner.nextDouble();
            verkoper.setVerkoopMaand(i, bedrag);
        }
        Verkoper[] verkopers = new Verkoper[3];
        for (int i = 0; i < 3; i++){
            verkopers[i] = new Verkoper();
            verkopers[i].setNaam("verkoper" + (i+1));
            System.out.println("geef de verkoopcijfers van het laatste jaar in:");
            for (int j = 1; j < 12; j++){
                double bedrag = scanner.nextDouble();
                verkopers[i].setVerkoopMaand(j, 50);
            }
            System.out.printf("%s heeft voor $%.0f verkocht %n", verkopers[i].getNaam(), verkopers[i].getTotaalVerkocht());
        }

    }
}
