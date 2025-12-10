package voorbeelden.opdracht4;

public class KlasGroepApp {
    static void main() {
        System.out.printf("het maximaal aantal studenten per klas = %d.%n", KlasGroep.MAX_AANTAL);
        KlasGroep tinA = new KlasGroep("1TINA", 23);
        KlasGroep tinB = new KlasGroep("1TINB", 12);
        KlasGroep tinC = new KlasGroep("1TINC", 12);
        KlasGroep[] groepen = {tinA, tinB, tinC};
        for (KlasGroep klas: groepen){
            System.out.printf("in %s zitten %d studenten. %n", klas.getKlasgroep(), klas.getAantalStudenten());
        }
        double gemiddeld = (double)KlasGroep.getTotaalAantal() / KlasGroep.getTeller();
        System.out.println(gemiddeld);
    }
}
