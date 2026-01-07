package deel1.oefeningen.oefening3;

public class Gondelbaan {
    private String naam;
    private String land;
    private int hoogteDalstation;
    private int hoogteBergstation;
    private double lengte;
    private int snelheid;
    private int passagiersPerGondel;
    private int aantalGondels;
    private final String[] TOEGELATEN = {"Frankrijk", "Oostenrijk", "Zwitserland", "Italië"};

    public Gondelbaan(String naam, String land, double lengte, int snelheid) {
        setNaam(naam);
        setLand(land);
        this.lengte = lengte;
        setSnelheid(snelheid);
        aantalGondels++;

    }

    public Gondelbaan(String naam, String land) {
        this(naam, land, 3, 6);
    }

    public String getNaam() {
        return naam;
    }

    public String getLand() {
        return land;
    }

    public int getHoogteDalstation() {
        return hoogteDalstation;
    }

    public int getHoogteBergstation() {
        return hoogteBergstation;
    }

    public double getLengte() {
        return lengte;
    }

    public int getSnelheid() {
        return snelheid;
    }

    public int getPassagiersPerGondel() {
        return passagiersPerGondel;
    }

    public int getAantalGondels() {
        return aantalGondels;
    }

    public int getHoogteVerschil() {
        return hoogteBergstation - hoogteDalstation;
    }

    public double getDuur() {
        double lengteM = lengte * 1000;
        double tijdS = lengteM / snelheid;
        return tijdS / 60.0;
    }

    public int getVervoersCapaciteit() {
        return (int) ((60 * passagiersPerGondel * aantalGondels) / getDuur());
    }

    public void setNaam(String naam) {
        StringBuilder bob = new StringBuilder();
        String[] splitNaam = naam.split(" ");
        for (String deelNaam : splitNaam) {
            bob.append(Character.toUpperCase(deelNaam.charAt(0))).append(deelNaam.substring(1).toLowerCase()).append(" ");
        }
        bob.deleteCharAt(bob.lastIndexOf(" "));
        this.naam = bob.toString();
    }

    public void setLand(String land) {
        for (String toegelaten : TOEGELATEN) {
            if (land.equals(toegelaten)) {
                this.land = land;
                return;
            }
            this.land = "Onbekend";
        }
    }

    public void setHoogte(int hoogte1, int hoogte2) {
        if (hoogte1 >= hoogte2) {
            hoogteBergstation = hoogte1;
            hoogteDalstation = hoogte2;
        } else {
            hoogteBergstation = hoogte2;
            hoogteDalstation = hoogte1;
        }
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setSnelheid(int snelheid) {
        if (snelheid < 3) {
            snelheid = 3;
        } else if (snelheid > 8) {
            snelheid = 8;
        }
        this.snelheid = snelheid;
    }

    public void setPassagiersPerGondel(int passagiersPerGondel) {
        this.passagiersPerGondel = passagiersPerGondel;
    }

    public void setAantalGondels(int aantalGondels) {
        this.aantalGondels = aantalGondels;
    }

    public String toString() {
        return String.format("%s [%dm]", naam, getHoogteVerschil());
    }
}
