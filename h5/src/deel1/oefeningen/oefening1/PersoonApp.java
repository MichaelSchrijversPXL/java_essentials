package deel1.oefeningen.oefening1;


import java.util.Random;

public class PersoonApp {
    static void main() {
        Random random = new Random();
        Persoon persoon1 = new Persoon("michael", "Schrijvers");
        persoon1.setGewicht(random.nextInt(40,101));
        persoon1.setLengte(random.nextInt(158,210) / 100.0);
        System.out.println(persoon1.encrypteerNaam(random.nextInt(1,21)));
    }
}
