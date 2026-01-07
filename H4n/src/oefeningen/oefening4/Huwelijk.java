package oefeningen.oefening4;

public class Huwelijk {
    private Persoon partner1;
    private Persoon partner2;

    public Huwelijk(Persoon persoon1, Persoon persoon2){
        partner1 = persoon1;
        partner2 = persoon2;
        persoon2.setAdres(persoon1.getAdres());
        System.out.printf("%s en %s zijn gehuwd, proficiat!", partner1.toString(), partner2.toString());
    }

    public void adresWijziging(String straat, String huisnummer, int postcode, String gemeente){
        Adres nieuwAdr = new Adres(straat, huisnummer, postcode, gemeente);
        partner2.setAdres(nieuwAdr);
        partner1.setAdres(nieuwAdr);
    }

    public Persoon getPartner1() {
        return partner1;
    }

    public Persoon getPartner2() {
        return partner2;
    }

    public String toString(){
        return String.format("%s en %s zijn gehuwd%n ze wonen op adres: %s", partner1.toString(), partner2.toString(), partner1.getAdres().toString());
    }
}
