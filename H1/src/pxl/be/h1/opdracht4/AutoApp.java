package pxl.be.h1.opdracht4;

public class AutoApp {
    static void main(String[] args) {
        Auto auto = new Auto();
        auto.setMerk("toyota");
        auto.setKleur("paars");
        auto.setKilometerstand(120000);
        auto.setAantalDeuren(5);
        auto.setAutomaat(true);
        auto.printGegevens();
    }
}
