package H1oefeningen.oefening8;

import java.util.Scanner;

public class LiftApp {
    static void main() {
        Lift lift = new Lift();
        lift.setAantalToegelaten(5);
        lift.setAantalVerdiepingen(11);
        Scanner input = new Scanner(System.in);
        printMenu();
        int keuze = input.nextInt();
        while(keuze != 4){
            // dit is de perfecte plaats voor een switch over een if else structuur YOU CAN NOT STOP ME
            // anders if keuze == 1 else if keuze == 2 else keuze == 3 zelfde code maar switch is sneller
            switch (keuze){
                case 1:
                    System.out.println("verdieping:");
                    lift.gaNaar(input.nextInt());
                    break;
                case 2:
                    System.out.println("aantal personen:");
                    lift.betreed(input.nextInt());
                    break;
                default:
                    System.out.println("aantal personen:");
                    lift.verlaat(input.nextInt());
                    break;
            }
            printMenu();
            keuze = input.nextInt();
        }

    }

    static void printMenu(){
        System.out.println("Maak uw keuze:");
        System.out.println("1. Ga naar verdieping ...");
        System.out.println("2. Betreed de lift...");
        System.out.println("3. Verlaat de lift...");
        System.out.println("4. Stoppen");
    }
}
