package H1oefeningen.oefening2;

import java.util.Scanner;
public class ZwembadApp {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Zwembad mijnzwembad = new Zwembad();
        System.out.print("geef de breedte in: ");
        mijnzwembad.setBreedte(input.nextDouble());
        System.out.print("geef de lengte in: ");
        mijnzwembad.setLengte(input.nextDouble());
        System.out.print("geef de diepte in: ");
        mijnzwembad.setDiepte(input.nextDouble());
        System.out.println("liter water: " + (int)mijnzwembad.getVolumeWater());
        System.out.println("liters ontsmettingsmiddel: " + (int)mijnzwembad.getVolumeOntsmettingsmiddel());
    }
}
