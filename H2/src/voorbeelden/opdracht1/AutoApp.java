package voorbeelden.opdracht1;

public class AutoApp {
    static void main(String[] args) {
        Auto auto2 = new Auto("BMW", "Rood", 4);
        Auto auto = new Auto();
        auto.setMerk("toyota");
        auto.setKleur("paars");
        Auto auto3 = new Auto("mercedes", "zwart",4,5000);
        Auto auto4 = new Auto(auto2);
        auto.setKilometerstand(120000);
        auto.setAantalDeuren(5);
        auto.setAutomaat(true);
        auto.printGegevens();
    }
}
