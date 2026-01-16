package opdrachten.opdracht11;

public class FigurenApp {
    static void main() {
        Cirkel cirkel = new Cirkel(10, 20, 50);
        Cirkel cirkel2 = new Cirkel(1, 5, 20);
        Rechthoek rechthoek = new Rechthoek(10, 20, 5, 9);
        Vierkant vierkant = new Vierkant(100, 20, 15);
        Driehoek driehoek = new Driehoek(5, 20, 10, 30, 10);
        GrafischElement[] elementen = {cirkel, cirkel2, rechthoek, vierkant, driehoek};
        for (GrafischElement element : elementen){
            String tekst = "";
            if (element instanceof Vierkant){
                tekst = "vierkant";
            } else if (element instanceof Rechthoek) {
                tekst = "Rechthoek";
            } else if (element instanceof Driehoek) {
                tekst = "Driehoek";
            } else if (element instanceof Cirkel) {
                tekst = "Cirkel";
            }
            System.out.printf("Omtrek: %10.0f Oppervlakte: %10.0f %10S%n", element.getOmtrek(), element.getOppervlakte(), tekst);
        }
    }

}
