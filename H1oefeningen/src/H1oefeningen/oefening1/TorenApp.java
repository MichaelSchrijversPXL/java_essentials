package H1oefeningen.oefening1;

public class TorenApp {
    static void main(String[] args) {
        Toren zuidertoren = new Toren();
        zuidertoren.setNaam("Zuidertoren");
        zuidertoren.setLocatie("sint-gillis");
        zuidertoren.setDatumVoltooid(1976);
        zuidertoren.setHoogte(150);
        zuidertoren.setAantalVerdiepingen(37);

        System.out.println("de toren is: " + zuidertoren.getNaam() + " in " + zuidertoren.getLocatie() + " deze was voltooid in: "
                + zuidertoren.getDatumVoltooid() + " en is " + zuidertoren.getHoogte() + "m hoog en telt: " + zuidertoren.getAantalVerdiepingen() +
                " verdiepingen.");
    }
}
