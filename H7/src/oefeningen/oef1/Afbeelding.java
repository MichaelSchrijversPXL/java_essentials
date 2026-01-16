package oefeningen.oef1;

import java.util.Random;

public class Afbeelding extends Bestand {
    private int[] dimensies;

    public Afbeelding(String naam, int[] dimensies) {
        super(naam, dimensies[0] * dimensies[1] * 3);
        this.dimensies = dimensies;
    }

    public void voerUit() {
        System.out.println(getNaam());
        System.out.println(berekenInhoud());
    }

    private String berekenInhoud() {
        String inhoud = getInhoud();
        Random hulp = new Random();
        StringBuilder bob = new StringBuilder();
        StringBuilder res =new StringBuilder();
        for (int i = 0; i < dimensies[0]; i++) {
            for (int j = 0; j < dimensies[1]; j++) {
                char nieuw = inhoud.charAt(hulp.nextInt(0,inhoud.length()));
                bob.append(nieuw);
            }
            res.append(String.format("%s\n", bob));
            bob = new StringBuilder();
        }
        return res.toString();
    }
}
