package pxl.be.h1.extra3;

public class Voetballer {
    private String naam;
    private int rugnummer;
    private String positie = "onbekend";

    public String getNaam() {
        return naam;
    }

    public int getRugnummer() {
        return rugnummer;
    }

    public String getPositie() {
        return positie;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setRugnummer(int rugnummer) {
        if (rugnummer < 1)
            this.rugnummer = 1;
        else if (rugnummer > 22) {
            this.rugnummer = 22;
        } else
            this.rugnummer = rugnummer;
    }

    public void setPositie(String positie) {
        this.positie = positie;
    }

    public void verhoogRugnummer(){
        this.setRugnummer(rugnummer++);
    }

    public void verhoogRugnummer(int extra){
        this.setRugnummer(rugnummer += extra);
    }
}
