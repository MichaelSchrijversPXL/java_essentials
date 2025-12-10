package H1oefeningen.oefening8;

public class Lift {
    private int aantalVerdiepingen;
    private int huidigeVerdieping;
    private int aantalPersonen;
    private int aantalToegelaten;

    public int getAantalVerdiepingen() {
        return aantalVerdiepingen;
    }

    public int getHuidigeVerdieping() {
        return huidigeVerdieping;
    }

    public int getAantalPersonen() {
        return aantalPersonen;
    }

    public int getAantalToegelaten() {
        return aantalToegelaten;
    }

    public void setAantalVerdiepingen(int aantalVerdiepingen) {
        this.aantalVerdiepingen = aantalVerdiepingen;
    }

    public void setHuidigeVerdieping(int huidigeVerdieping) {
        this.huidigeVerdieping = huidigeVerdieping;
    }

    public void setAantalPersonen(int aantalPersonen) {
        this.aantalPersonen = aantalPersonen;
    }

    public void setAantalToegelaten(int aantalToegelaten) {
        this.aantalToegelaten = aantalToegelaten;
    }

    public void betreed(int hoeveelheid){
        aantalPersonen += hoeveelheid;
        if (aantalPersonen > aantalToegelaten){
            aantalPersonen = aantalToegelaten;
        }
    }

    public void verlaat(int hoeveelheid){
        if (aantalPersonen > 0){
            aantalPersonen -= hoeveelheid;
            if (aantalPersonen < 0){
                aantalPersonen = 0;
            }
        }
    }

    public void gaNaar(int verdieping){

        if (aantalPersonen > 0 || verdieping > aantalVerdiepingen || verdieping < 0){
            if (verdieping > huidigeVerdieping){
                for (int i = huidigeVerdieping; i <= verdieping; i++){
                    System.out.printf("---%n|%d|%n---%n", i);
                }
            } else if (verdieping < huidigeVerdieping) {
                for (int i = huidigeVerdieping; i >= verdieping; i--){
                    System.out.printf("---%n|%d|%n---%n", i);
                }
            } else
                System.out.println("Je bent er al");
            huidigeVerdieping = verdieping;
        } else
            System.out.println("De lift zal niet bewegen");
    }
}
