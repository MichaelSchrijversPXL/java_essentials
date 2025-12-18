package oefeningen.oef2;

public class Kaart {
    private Waarde waarde;
    private Soort soort;

    Kaart(Waarde waarde, Soort soort){
        this.waarde = waarde;
        this.soort = soort;
    }

    public Waarde getWaarde() {
        return waarde;
    }

    public void setWaarde(Waarde waarde) {
        this.waarde = waarde;
    }

    public Soort getSoort() {
        return soort;
    }

    public void setSoort(Soort soort) {
        this.soort = soort;
    }

    @Override
    public String toString(){
        return String.format("%s %s",waarde.name(),soort.name());
    }
}
