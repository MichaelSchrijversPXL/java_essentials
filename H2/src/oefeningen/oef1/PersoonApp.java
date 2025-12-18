package oefeningen.oef1;

public class PersoonApp {
    static void main() {
        Persoon persoon1 = new Persoon();
        Persoon persoon2 = new Persoon("michael", "schrijvers");
        Persoon persoon3 = new Persoon(persoon1);
        System.out.println(persoon1.toString());
        System.out.println(persoon2.toString());
        System.out.println(persoon3.toString());
        persoon2.groei();
        persoon2.voegVoornamenToe(new String[]{"dit", "is", "een test"});
        System.out.println(persoon2.toString());
        System.out.println(persoon2.geefOmschrijving());
    }
}
