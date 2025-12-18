package oefeningen.oefening1;

public class Band {
    private String naam;
    private Muzikant[] leden;

    public Band(String naam, Muzikant[] leden) {
        this.naam = naam;
        this.leden = leden;
    }

    public void speel(int lengte) {
        System.out.printf("%s in concert!%n", naam);
//        int teller = 0;
        for (int i = 0; i < lengte; i++) {
//            if (teller > leden.length - 1)
//                teller = 0;
            leden[i % leden.length].speel();
//            teller++;
        }
    }

    public String toString() {
        StringBuilder hulp = new StringBuilder(naam).append("\n");
        for (Muzikant lid : leden) {
            hulp.append(lid.toString()).append("\n");
        }
        return hulp.toString();
    }
}
