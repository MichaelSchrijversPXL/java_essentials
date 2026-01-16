package oefeningen.oef1;

public class TekstBestand extends Bestand {
    public TekstBestand(String naam){
        super(naam, naam.length());
    }

    public void voerUit(){
        System.out.printf("%S\n %s\n", getNaam(), getBestandsGrootte());
    }
}
