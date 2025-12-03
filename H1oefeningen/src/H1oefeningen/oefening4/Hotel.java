package H1oefeningen.oefening4;

import java.security.PublicKey;

public class Hotel {
    private String hotelCode;
    private int aantalSterren;
    private char kindercode;

    public void setHotelCode(String hotelCode) {
        this.hotelCode = hotelCode;
    }

    public void setAantalSterren(int aantalSterren) {
        this.aantalSterren = aantalSterren;
    }

    public void setKindercode(char kindercode) {
        this.kindercode = kindercode;
    }

    public char getKindercode() {
        return kindercode;
    }

    public int getAantalSterren() {
        return aantalSterren;
    }

    public String getHotelCode() {
        return hotelCode;
    }

    public String getSterren(){
        StringBuilder hulp = new StringBuilder();
        for (int i = 0; i < aantalSterren; i++){
            hulp.append('*');
        }
        return hulp.toString();
    }

    public double getPrijs(){
        double prijs = 60;
        if (hotelCode.equals("HI"))
            prijs = 70;
        else if (aantalSterren < 3){
            prijs = 48;
        } else if (aantalSterren == 3 && !(hotelCode.equals("AN") || hotelCode.equals("BR"))){
            prijs = 56;
        }
        return prijs;
    }

    public double getPrijsKind(){
        if (kindercode == 'A'){
            if (hotelCode.equals("HA") || aantalSterren <= 2){
                return 0.0;
            }
        }
        return this.getPrijs() * 0.5;
    }
}
