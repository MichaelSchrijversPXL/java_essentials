package oefeningen.oef1;

public class Persoon {
    private String voornaam;
    private String naam;
    private double lengte;
    private double gewicht;
    private int geboortejaar;
    static final double MAX_LENGTE = 2.4;
    static final int HUIDIG_JAAR = 2025;

    Persoon(String naam, String voornaam) {
        this.naam = naam;
        this.voornaam = voornaam;
    }

    Persoon() {
        this("onbekend", "onbekend");
    }

    Persoon(Persoon persoon) {
        this(persoon.naam, persoon.voornaam);
        lengte = persoon.lengte;
        gewicht = persoon.gewicht;
        geboortejaar = persoon.geboortejaar;
    }

public String getVoornaam() {
    return voornaam;
}

    public String getNaam() {
        return naam;
    }

    public double getLengte() {
        return lengte;
    }

    public double getGewicht() {
        return gewicht;
    }

    public int getGeboortejaar() {
        return geboortejaar;
    }

    public int getLeeftijd() {
        return HUIDIG_JAAR - geboortejaar;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setLengte(double lengte) {
        if (lengte > MAX_LENGTE) {
            lengte = MAX_LENGTE;
        }
        this.lengte = lengte;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public void setGeboortejaar(int geboortejaar) {
        this.geboortejaar = geboortejaar;
    }

    public void groei(){
        this.setLengte(lengte + 0.01);
    }

    public void groei(double cm){
        this.setLengte(lengte + cm);
    }

    @Override
    public String toString() {
        return String.format("Deze persoon is %s %s%n" +
                "%-40s: %.2f%n" +
                "%-40s: %.2f%n" +
                "%-40s: %d%n", voornaam, naam, "gewicht",gewicht, "lengte",lengte, "geboortejaar",geboortejaar);
    }

    public double berekenBMI(){
        return gewicht / (lengte * lengte);
    }

    public String geefOmschrijving(){
        double bmi = berekenBMI();
        if (bmi < 18)
            return "ondergewicht";
        if (bmi < 25)
            return "normaal";
        if (bmi < 30)
            return "overgewicht";
        if (bmi<40)
            return "obesitas";
        return "morbide obesitas";
    }

    public void voegVoornamenToe(String[] voornamen){
        StringBuilder hulp = new StringBuilder(voornaam);
        for (String voornaam: voornamen){
            hulp.append(" ").append(voornaam);
        }
        this.voornaam = hulp.toString();
    }
}
