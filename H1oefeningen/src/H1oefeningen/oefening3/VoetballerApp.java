package H1oefeningen.oefening3;

import java.util.Scanner;

public class VoetballerApp {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Voetballer speler = new Voetballer();
        System.out.print("Naam: ");
        speler.setNaam(input.nextLine());
        while (!speler.getNaam().equals("stop")){
            System.out.print("Leeftijd: ");
            speler.setLeeftijd(input.nextInt());
            System.out.print("positie: ");
            speler.setType(input.next());
            System.out.print("beoordeling: ");
            speler.setGemiddeldeBeoordeling(input.nextInt());
            System.out.print("Doelpunten: ");
            speler.setAantalDoelpunten(input.nextInt());
            input.nextLine();
            System.out.printf("prijs: $%.2f \n", speler.getPrijs());
            System.out.print("Naam: ");
            speler.setNaam(input.nextLine());
        }

    }



}
