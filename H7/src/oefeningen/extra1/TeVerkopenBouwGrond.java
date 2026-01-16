package oefeningen.extra1;

import java.time.LocalDate;
import java.time.Period;

public class TeVerkopenBouwGrond extends BouwGrond {
    private String notaris;
    private LocalDate datumTeKoop;
    private double hoogsteBod;
    private LocalDate datumHoogsteBod;

    public TeVerkopenBouwGrond(String perceelNummer, double perceelGrootte, String bouwVoorschrift) {
        super(perceelNummer, perceelGrootte);
        setBouwVoorschrift(bouwVoorschrift);
    }

    public String getNotaris() {
        return notaris;
    }

    public LocalDate getDatumTeKoop() {
        return datumTeKoop;
    }

    public double getHoogsteBod() {
        return hoogsteBod;
    }

    public LocalDate getDatumHoogsteBod() {
        return datumHoogsteBod;
    }

    public void wijsEenNotarisToe(String naam, LocalDate datumTeKoop) {
        if (this.datumTeKoop == null) {
            notaris = naam;
            this.datumTeKoop = datumTeKoop;
        }
    }

    public void doeEenBod(double bod, LocalDate datumHoogsteBod) {
        if (notaris != null && Period.between(datumTeKoop, datumHoogsteBod).getDays() > 10) {
            if (bod > 1.0 * minPrijsM2 * (getPerceelGrootte() * 100)) {
                if (bod > hoogsteBod) {
                    System.out.printf("perceelnummer: %s\n", getPerceelNummer());
                    System.out.printf("Perceelgrootte: %.2f\n", getPerceelGrootte());
                    System.out.printf("Bouwvoorschrift: %s\n", getBouwVoorschrift());
                    System.out.printf("Te koop gesteld op: %TD bij notaris %s\n", datumTeKoop, notaris);
                    if (hoogsteBod > 0){
                        System.out.printf("Vorig hoogste bod %.3f geregistreerd op %TD\n", hoogsteBod, datumHoogsteBod);
                    }
                    hoogsteBod = bod;
                    this.datumHoogsteBod = datumHoogsteBod;
                    System.out.printf("nieuwe hoogste bod %.3f geregistreerd op %TD\n", hoogsteBod, datumHoogsteBod);
                }
            }
        } else {
            System.out.println("BOD TE VROEG OF ER IS GEEN NOTARIS");
        }

    }
}
