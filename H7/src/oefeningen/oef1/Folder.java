package oefeningen.oef1;

import java.util.ArrayList;

public class Folder implements Uitvoerbaar{
    private String naam;
    private ArrayList<Bestand> bestanden;

    public Folder(String naam){
        this.naam = naam;
        bestanden = new ArrayList<>();
    }

    public void voegBestandenToe(Bestand[] bestanden){
        for (Bestand bestand: bestanden){
            this.bestanden.add(bestand);
        }
    }

    public void voerUit(){
        System.out.println(naam);
        for (Bestand bestand: bestanden){
            System.out.println(bestand.toString());
        }
    }
}
