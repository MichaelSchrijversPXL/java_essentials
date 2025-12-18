package deel1.voorbeelden;

import java.util.Scanner;

public class Opdracht2 {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("geef de straal in:");
        double r = scanner.nextDouble();
        System.out.println("geef de hoogte van de pizza in");
        double h = scanner.nextDouble();
        double inhoud = Math.PI * r * r * h;
        // weergeven als ALS ER MEE VERDER GEREKEND WORD GEBRUIKEN WE WEL ROUND
        System.out.printf("de inhoud van de pizza is %.2f", inhoud);
        inhoud = Math.round(inhoud * 100);
        inhoud /= 100.0;
    }
}
