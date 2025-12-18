package project1;

import java.time.LocalDate;

public class Wijn {
    private String naam;
    private String omschrijving;
    private String druivenras;
    private String kleur;
    private String land;
    private String regio;
    private int jaargang;
    private double alcoholPercentage;
    private String serveerTip;
    static final String[] GELDIGE_LANDEN = {"Frankrijk", "Chili", "Spanje", "Italie", "Onbekend"};
    static final String[] GELDIGE_KLEUREN = {"Wit", "Rose", "Rood"};
    public static double MAX_ALCOHOLPERCENTAGE = 17;


    public Wijn(String naam, String land, String kleur, int jaargang, double alcoholPercentage) {
        this.naam = naam;
        setLand(land);
        setKleur(kleur);
        setJaargang(jaargang);
        setAlcoholPercentage(alcoholPercentage);
    }

    public Wijn(String naam, String kleur, String land) {
        this(naam, land, kleur, LocalDate.now().getYear() - 1, 12.5);
    }


    public String getNaam() {
        return naam;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public String getDruivenras() {
        return druivenras;
    }

    public String getKleur() {
        return kleur;
    }

    public String getLand() {
        return land;
    }

    public String getRegio() {
        return regio;
    }

    public int getJaargang() {
        return jaargang;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public String getServeerTip() {
        return serveerTip;
    }


    public static double getMaxAlcoholpercentage() {
        return MAX_ALCOHOLPERCENTAGE;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public void setDruivenras(String druivenras) {
        this.druivenras = druivenras;
    }

    public void setKleur(String kleur) {
        if (!isGeldig(GELDIGE_KLEUREN, kleur)) {
            kleur = "Rood";
        }
        this.kleur = kleur;
    }

    public void setLand(String land) {
        if (!isGeldig(GELDIGE_LANDEN, land)) {
            land = "Onbekend";
        }
        this.land = land;
    }

    public void setRegio(String regio) {
        this.regio = regio;
    }

    public void setJaargang(int jaargang) {
        if (jaargang < 1950) {
            jaargang = 1950;
        } else if (jaargang > LocalDate.now().getYear()) {
            jaargang = LocalDate.now().getYear();
        }

        this.jaargang = jaargang;
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        if (alcoholPercentage < 0) {
            alcoholPercentage = 0;
        } else if (alcoholPercentage > MAX_ALCOHOLPERCENTAGE) {
            alcoholPercentage = MAX_ALCOHOLPERCENTAGE;
        }
        this.alcoholPercentage = alcoholPercentage;
    }

    public void setServeerTip(String serveertip) {
        this.serveerTip = serveertip;
    }

    public static void setMaxAlcoholpercentage(double maxAlcoholpercentage) {
        MAX_ALCOHOLPERCENTAGE = maxAlcoholpercentage;
    }

    public boolean isGeldig(String[] array, String str) {
        for (String string : array) {
            if (string.equals(str))
                return true;
        }
        return false;
    }
}
