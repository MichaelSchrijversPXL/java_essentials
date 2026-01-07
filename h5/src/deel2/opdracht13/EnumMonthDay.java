package deel2.opdracht13;

import java.time.DayOfWeek;
import java.time.Month;

public class EnumMonthDay {
    public static void main(String[] args) {
        Month maand = Month.FEBRUARY;
        DayOfWeek dag = DayOfWeek.FRIDAY;
        System.out.println(dag + " " + maand);

        System.out.print("Het aantal dagen in deze maand ");
        System.out.println(maand.length(true));

        System.out.println("5 maanden verder is de maand " + maand.plus(5));
        System.out.print("3 dagen eerder is ");
        System.out.println(dag.minus(3));
    }
}
