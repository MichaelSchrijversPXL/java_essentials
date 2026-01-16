package oefeningen.extra1;

import java.time.LocalDate;

public class VerkoopApp {
    static void main() {
        TeVerkopenBouwGrond grond = new TeVerkopenBouwGrond("12ER", 12.40,"Open Bebouwing");
        grond.wijsEenNotarisToe("Dirk Peeters", LocalDate.of(2022,12,07));
        grond.doeEenBod(150000, LocalDate.of(2022,12,23));
        grond.doeEenBod(175000,LocalDate.of(2023,4,1));
    }
}
