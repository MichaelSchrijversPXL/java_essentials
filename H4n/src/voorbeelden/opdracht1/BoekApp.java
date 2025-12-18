package voorbeelden.opdracht1;

public class BoekApp {
    static void main() {
        Boek boek = new Boek();
        boek.setTitel("eragon");
        boek.setIsbn("9780375840548");
        boek.setBladzijden(1000);
        boek.getAuteur().setVoornaam("Christopher");
        boek.getAuteur().setNaam("Paolini");
        boek.toonBoekGegevens();
    }


}
