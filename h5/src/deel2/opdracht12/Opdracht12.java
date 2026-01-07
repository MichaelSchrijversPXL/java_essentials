package deel2.opdracht12;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Opdracht12 {
    static void main() {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("geef een weekdag in 1-7");
        int dagNummer = scanner.nextInt();
        DayOfWeek dag = DayOfWeek.of(dagNummer);
        System.out.printf("> startdag %s%n", dag);
        System.out.println("geef aantal dagen op te tellen");
        int aantal = scanner.nextInt();
        DayOfWeek volgendeDag = dag.plus(aantal);
        System.out.printf("> Resultaat: %s%n", volgendeDag);
    }
}
