package opdrachten.opdracht10;

public class FigurenApp {
    static void main() {
        Cirkel cirkel = new Cirkel(10,20,50);
        Cirkel cirkel2 = new Cirkel(1,5,20);
        System.out.printf("Cirkel met middelpunt (%d,%d) en straal %.0f ",cirkel.getX(), cirkel.getY(), cirkel.getStraal());
        System.out.printf("en heeft een omtrek %.2f een een oppervlakte van %.2f%n", cirkel.getOmtrek(), cirkel.getOppervlakte());
        System.out.printf("Cirkel met middelpunt (%d,%d) en straal %.0f%n",cirkel2.getX(), cirkel2.getY(), cirkel2.getStraal());
        System.out.printf("het aantal aangemaakte cirkels is: %d%n", Cirkel.getTeller());
        System.out.println(cirkel.toString());
        System.out.println();
        System.out.println(cirkel2.toString());
        Cirkel cirkel3 = new Cirkel(1,5,20);
        System.out.printf("Zijn cirkel 2 en cirkel3 gelijk? %b%n", cirkel2.equals(cirkel3));

    }

}
