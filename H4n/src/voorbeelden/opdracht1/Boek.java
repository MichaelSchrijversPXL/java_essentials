package voorbeelden.opdracht1;

public class Boek {
    private String isbn;
    private String titel;
    private int bladzijden;
    private Auteur auteur;

    public Boek(String isbn, String titel, int bladzijden, Auteur auteur) {
        this.isbn = isbn;
        this.titel = titel;
        this.bladzijden = bladzijden;
        this.auteur = auteur;
    }

    public Boek() {
        this("onbekend", "onbekend",0,new Auteur("onbekend", "onbekend"));
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitel() {
        return titel;
    }

    public int getBladzijden() {
        return bladzijden;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setBladzijden(int bladzijden) {
        this.bladzijden = bladzijden;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public void toonBoekGegevens(){
        System.out.printf("isbn: %s%n", isbn);
        System.out.printf("titel %s%n", titel);
        System.out.printf("aantal bladzijden %d%n", bladzijden);
        System.out.println(auteur.toString());
    }
}
