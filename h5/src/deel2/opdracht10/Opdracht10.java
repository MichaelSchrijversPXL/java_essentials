package deel2.opdracht10;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Opdracht10 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef je geboortedatum in (d/m/yyyy)");
        String geboorteDatumTekst = scanner.next();
        String[] gegevens= geboorteDatumTekst.split("/");
        int dag = Integer.parseInt(gegevens[0]);
        int month = Integer.parseInt(gegevens[1]);
        int year = Integer.parseInt(gegevens[2]);
        LocalDate geboortedatum = LocalDate.of(year, month ,dag);
        Period period = Period.between(geboortedatum, LocalDate.now());
        System.out.printf("je bent %d jaren %d maanden en %d dagen oud. %n", period.getYears(), period.getMonths(), period.getDays());
        System.out.printf("dit is het dagnummer %d van het jaar %n", geboortedatum.getDayOfYear());
        System.out.printf("je bent geboren op %s%n", geboortedatum.getDayOfWeek());
        System.out.printf("was het een schrikkeljaar? %b%n", geboortedatum.isLeapYear());
        LocalDate volgendeVerjaardag = geboortedatum.withYear(LocalDate.now().getYear());
        if (volgendeVerjaardag.isBefore(LocalDate.now())){
            volgendeVerjaardag = volgendeVerjaardag.plusYears(1);
        }
        System.out.println("volgende verjaardag " + volgendeVerjaardag);
        Period volgendePeriode = Period.between(LocalDate.now(), volgendeVerjaardag);
        System.out.printf("volgende verjaardag is nog %d maanden en %d dagen wachten %n", volgendePeriode.getMonths(), volgendePeriode.getDays());
        System.out.printf("Of nog %d dagen%n", ChronoUnit.DAYS.between(LocalDate.now(), volgendeVerjaardag));
    }
}
