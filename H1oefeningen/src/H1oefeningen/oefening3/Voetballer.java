package H1oefeningen.oefening3;

public class Voetballer {
    private String naam;
    private int leeftijd;
    private double gemiddeldeBeoordeling;
    private String type;
    private int aantalDoelpunten;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public double getGemiddeldeBeoordeling() {
        return gemiddeldeBeoordeling;
    }

    public void setGemiddeldeBeoordeling(double gemiddeldeBeoordeling) {
        this.gemiddeldeBeoordeling = gemiddeldeBeoordeling;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAantalDoelpunten() {
        return aantalDoelpunten;
    }

    public void setAantalDoelpunten(int aantalDoelpunten) {
        this.aantalDoelpunten = aantalDoelpunten;
    }

    public double getPrijs(){
        double basisprijs = 0;
        if (type.equals("Aanvaller")){
            basisprijs = 30000;
        } else if (type.equals("Verdediger")) {
            basisprijs = 29000;
        } else if (type.equals("Middenvelder")) {
            basisprijs = 28000;
        } else {
            basisprijs = 25000;
        }

        if (leeftijd < 25){
            basisprijs = basisprijs * 1.1;
        } else if (leeftijd > 30) {
            basisprijs = basisprijs * 0.95;
        }

        if (type.equals("Aanvaller")) {
            if (aantalDoelpunten > 0)
                if (aantalDoelpunten <= 5){
                basisprijs += aantalDoelpunten * 10000;
                } else {
                    basisprijs += (5 * 10000) + (aantalDoelpunten - 5) * 20000;
                }
        } else {
            if (type.equals("Doelman") && aantalDoelpunten >=20) basisprijs -= 9000;
            basisprijs += 10000 * gemiddeldeBeoordeling;
        }



        return basisprijs;
    }
}

