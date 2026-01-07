package deel1.oefeningen.oefening1;

public class Persoon {
    private String voornaam;
    private String naam;
    private double lengte;
    private double gewicht;
    private int geboortejaar;
    public static final double MAX_LENGTE = 2.4;
    public static final int HUIDIG_JAAR = 2025;

    public Persoon(String naam, String voornaam) {
        this.naam = naam;
        this.voornaam = voornaam;
    }

    public Persoon() {
        this("onbekend", "onbekend");
    }

    public Persoon(Persoon persoon) {
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
        this.setLengte(lengte + cm/100);
    }

    @Override
    public String toString() {
        StringBuilder hulp = new StringBuilder("deze persoon is ");
        hulp.append(voornaam.toUpperCase()).append(" ").append(naam.toUpperCase()).append("\n");


        return String.format(hulp.toString() +
                "%-40s: %.2f%n" +
                "%-40s: %.2f%n" +
                "%-40s: %d%n","gewicht",gewicht, "lengte",lengte, "geboortejaar",geboortejaar);
    }

    public double berekenBmi(){
        return Math.round(gewicht / (lengte * lengte) * 10) /10.0;
    }

    public String geefOmschrijving(){
        double bmi = berekenBmi();
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

    public String geefNaamAfgekort(){
        StringBuilder hulp = new StringBuilder();
        hulp.append(Character.toUpperCase(voornaam.charAt(0))).append(".")
                .append(Character.toUpperCase(naam.charAt(0))).append(naam.substring(1).toLowerCase());
        return hulp.toString();
    }

    public String encrypteerNaam(int sleutel){
        if (!(sleutel > 1 && sleutel < 20)){
            sleutel = 1;
        }
        StringBuilder hulp = new StringBuilder();
        String naam = geefNaamAfgekort();
        for (int i = 0; i < geefNaamAfgekort().length(); i++){
            hulp.append((char) (naam.charAt(i) + sleutel));
        }
        return hulp.toString();
    }
}
