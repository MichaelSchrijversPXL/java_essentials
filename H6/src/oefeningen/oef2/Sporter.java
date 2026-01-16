package oefeningen.oef2;

import oefeningen.oef1.Persoon;

public class Sporter extends Persoon {
    private String omschrijvingSport;
    private static int teller;

    public Sporter(String naam, String voornaam, String omschrijvingSport) {
        super(voornaam, naam);
        this.omschrijvingSport = omschrijvingSport;
        teller++;
    }

    public Sporter(String naam, String voornaam) {
        this(naam, voornaam, "onbekend");
    }

    public static int getTeller() {
        return teller;
    }

    public void setOmschrijvingSport(String omschrijvingSport){
        this.omschrijvingSport = omschrijvingSport;
    }

    @Override
    public void print(){
        super.print();
        System.out.println(omschrijvingSport);
    }
}
