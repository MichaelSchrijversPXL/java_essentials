package oefeningen.oef1;

public class FileSystem {
    static void main() {
        Afbeelding afb = new Afbeelding("naam.jpg", new int[]{3,10});
        afb.setInhoud("#%$");
        afb.voerUit();
        TekstBestand tekst = new TekstBestand("een naam");
        tekst.voerUit();
        Folder folder = new Folder("mijn folder met bestanden");
        folder.voegBestandenToe(new Bestand[]{afb, tekst});
        folder.voerUit();
    }
}
