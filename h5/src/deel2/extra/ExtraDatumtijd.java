package deel2.extra;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExtraDatumtijd {
    static void main(String[] args) {
        LocalDateTime datumTijd = LocalDateTime.of(2018,10,14,22,32,27);
        System.out.println(datumTijd);
        // i jaar 2 maanden later maar 13u vroeger
        datumTijd = datumTijd.plusYears(1).plusMonths(2).plusWeeks(3).minusHours(13);
        System.out.println(datumTijd);
    }
}
