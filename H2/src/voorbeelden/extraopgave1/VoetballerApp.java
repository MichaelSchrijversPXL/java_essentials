package voorbeelden.extraopgave1;

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

        Voetballer ronaldo =  new Voetballer("cristiano ronaldo", 7, "Aanvaller");
        ronaldo.voegBijnamenToe(new String[]{"the goat"});
        Voetballer messi =  new Voetballer("lionel messi");
        Voetballer ronaldobis = new Voetballer(ronaldo);
        messi.setPositie("spits");
        messi.setRugnummer(45);
        Voetballer[] voetballers = {speler, ronaldobis, messi, ronaldo};
        for(Voetballer voetballer: voetballers){
            System.out.printf("%s is een %s met rugnummer: %d%n",
                    voetballer.getNaam(), voetballer.getPositie() , voetballer.getRugnummer());
        }


    }
}
