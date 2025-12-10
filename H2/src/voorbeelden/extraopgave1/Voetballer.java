package voorbeelden.extraopgave1;

public class Voetballer {
    private String naam;
    private int rugnummer;
    private String positie = "onbekend";
    private static String[] geldig = {"Aanvaller", "Doelman", "Verdediger", "Middenvelder"};
    private static int teller;


    public Voetballer(String naam, int rugnummer, String positie) {
        this.naam = naam;
        setRugnummer(rugnummer);
        this.positie = positie;
        teller++;
    }

    public Voetballer(String naam) {
        this.naam = naam;
    }

    public Voetballer() {
    }

    public Voetballer(Voetballer voetballer) {
        this(voetballer.naam, voetballer.rugnummer, voetballer.positie);
    }

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

    public String controlePositie(String pos){
        for (String geldige: geldig){
            if (pos.equals(geldige)){
                return pos;
            }
        }
        return "onbekend";
    }

    public void voegBijnamenToe(String[] bijnamen){
        StringBuilder builder = new StringBuilder();
        builder.append(naam);
        for(String bijnaam: bijnamen){
            builder.append(" ").append(bijnaam);
        }
        naam = builder.toString();
    }
}
