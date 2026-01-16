package oefeningen.extra1;

import java.time.LocalDate;

public interface Verkoopbaar {
    int minPrijsM2 = 83;
    void wijsEenNotarisToe(String naam, LocalDate datum);
    void doeEenBod(double bod, LocalDate datum);
}
