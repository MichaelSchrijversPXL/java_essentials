package oefeningen.oef2;

public final class Voetballer extends Sporter{
    // data hiding want private dus andere classes kunnen niet aan deze
    // variabelen zonder voorziene functies
    private String club;
    private String opstelling;
    private static final String[] TOEGELATEN = {"middenvelder", "aanvaller", "verdediger", "onbepaald"};

    public Voetballer(String naam, String voornaam){
        this(naam,voornaam,"onbepaald", "onbepaald");
    }
    // constructor overloading
    // constructor heeft een andere signatuur dus zo kunnen we er twee maken die apart aangeroepen worden
    // met dezelfde naam
    public Voetballer(String naam, String voornaam, String club, String opstelling){
        super(naam, voornaam,"voetbal");
        this.club = club;
        setOpstelling(opstelling);
    }


    public void setOpstelling(String opstelling) {
        opstelling = opstelling.toLowerCase();
        for(String opstel: TOEGELATEN){
            if (opstelling.equals(opstel)){
                this.opstelling = opstelling;
                return;
            }
            this.opstelling = "onbepaald";
        }
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getClub() {
        return club;
    }

    public String getOpstelling() {
        return opstelling;
    }

    public static String[] getToegelaten(){
        return TOEGELATEN;
    }

    // method overriding
    // we maken de method opnieuw aan in subklasse waardoor deze aangeroepen word
    @Override
    public void print(){
        super.print();
        System.out.printf("CLub: %s Opstelling: %s\n", club, opstelling);
    }
}
