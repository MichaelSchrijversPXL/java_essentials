package deel2.opdracht13;

import java.time.*;
import java.time.temporal.ChronoUnit;


public class DurationApp {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.of(2018, 12, 28);
        LocalDate thenDate = LocalDate.of(1980, 2, 15);

        System.out.println("Datum1: " + nowDate);
        System.out.println("Datum2: " + thenDate);

        Period period = Period.between(thenDate, nowDate);
        System.out.println("jaar: " + period.getYears() + " maanden:" + period.getMonths() + "  dagen: " + period.getDays());

        long days = ChronoUnit.DAYS.between(thenDate, nowDate);
        System.out.println("aantal dagen tussen 2 datums " + days);

        //Wat als je argumenten op R29 omwisselt?
        long daysOmgedraaid = ChronoUnit.DAYS.between(nowDate, thenDate);
        System.out.println("aantal dagen tussen 2 datums " + daysOmgedraaid);
    }
}
