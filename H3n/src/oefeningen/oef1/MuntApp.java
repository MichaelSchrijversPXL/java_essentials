package oefeningen.oef1;

import java.util.Scanner;

public class MuntApp {
    static void main() {
        Scanner inp = new Scanner(System.in);
        System.out.print("geef het bedrag in: ");
        double bedragInEuro = inp.nextDouble();
        while (bedragInEuro < 0 || bedragInEuro > 10){
            System.out.print("geef het bedrag in: ");
            bedragInEuro = inp.nextDouble();
        }
        bedragInEuro *= 100;
        int bedrag = (int)bedragInEuro;

        int hoeveelheid;
        Munt munt;
        for (int i = Munt.values().length - 1; i >= 0; i--){
            if (bedrag >= munt.getWaarde()){
                munt = Munt.values()[i];
                hoeveelheid = bedrag / munt.getWaarde();
                bedrag = bedrag % munt.getWaarde();
                if (hoeveelheid != 0)
                    System.out.printf("het aantal %s stukken is gelijk aan %d%n",munt.name(), hoeveelheid );
            }
        }
    }
}
