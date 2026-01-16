package oefeningen.oef1;

public abstract class Bestand implements Uitvoerbaar {
    private String naam;
    private String inhoud;
    private int bestandsGrootte = 1024;

    public Bestand(String naam, int bestandsGrootte) {
        this.naam = naam;
        this.bestandsGrootte = bestandsGrootte;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getInhoud() {
        return inhoud;
    }

    public void setInhoud(String inhoud) {
        this.inhoud = inhoud;
    }

    public int getBestandsGrootte() {
        return bestandsGrootte;
    }

    public void setBestandsGrootte(int bestandsGrootte) {
        this.bestandsGrootte = bestandsGrootte;
    }

    @Override
    public String toString() {
        return String.format("%20S %20d bytes", naam, bestandsGrootte);
    }
}
