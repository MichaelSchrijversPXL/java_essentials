package pxl.be.h1.extra3;

public class VoetballerApp {
    static void main() {
        Voetballer speler = new Voetballer();
        speler.setNaam("Kevin DeBruyne");
        speler.setRugnummer(7);
        speler.setPositie("Middenvelder");

        System.out.printf("%s is een %s met rugnummer: %d%n",
                speler.getNaam(), speler.getPositie() , speler.getRugnummer());
        speler.verhoogRugnummer();
        System.out.printf("%s is een %s met rugnummer: %d%n",
                speler.getNaam(), speler.getPositie() , speler.getRugnummer());
        speler.verhoogRugnummer(5);
        System.out.printf("%s is een %s met rugnummer: %d%n",
                speler.getNaam(), speler.getPositie() , speler.getRugnummer());
    }
}
