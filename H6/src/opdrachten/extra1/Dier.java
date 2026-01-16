package opdrachten.extra1;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Dier {
    private String soort;
    private String voedselType;
    private LocalDate geboorteDatum;
    private static final String[] TOEGELATEN = {"herbivoor", "omnivoor", "carnivoor"};
    private static int aantal;

    public Dier(String soort, String voedselType, LocalDate geboorteDatum) {
        this.soort = soort;
        this.voedselType = voedselType;
        this.geboorteDatum = geboorteDatum;
        aantal++;
    }

    public Dier(String soort, String voedselType) {
        this(soort, voedselType, LocalDate.now());
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }

    public void setVoedselType(String voedselType) {
        voedselType = voedselType.toLowerCase();
        for (String type : TOEGELATEN) {
            if (type.equals(voedselType)) {
                this.voedselType = voedselType;
                return;
            }
        }
        this.voedselType = "onbekend";
    }

    public void setGeboorteDatum(LocalDate geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    public String getSoort() {
        return soort;
    }

    public String getVoedselType() {
        return voedselType;
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    public int getLeeftijd() {
        //return Period.between(geboorteDatum, LocalDate.now()).getYears();
        //met chronounit
        return (int)ChronoUnit.YEARS.between(geboorteDatum, LocalDate.now());
    }

    static int getAantal(){
        return aantal;
    }

    public void print(){
        System.out.printf("dit is een %s (%s) leeftijd %d jaar%n", soort, voedselType, getLeeftijd());
    }
}
