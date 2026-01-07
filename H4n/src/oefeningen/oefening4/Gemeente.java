package oefeningen.oefening4;

public class Gemeente {
    private int postcode;
    private String gemeenteNaam;

    public Gemeente(int postcode, String gemeenteNaam){
        setPostcode(postcode);
        this.gemeenteNaam = gemeenteNaam;
    }

    public int getPostcode() {
        return postcode;
    }

    public String getGemeenteNaam() {
        return gemeenteNaam;
    }

    public void setPostcode(int postcode) {
        if (postcode < 1000){
            while(postcode <= 1000){
                postcode *= 10;
            }
        } else if (postcode > 10000){
            // krijg het niet opgelost dus doe ik het even zo ook al weet ik dat dit niet hoort met wat we gezien hebben
            String nieuw = "" + postcode;
            nieuw = nieuw.substring(0,4);
            postcode = Integer.parseInt(nieuw);
        }
        this.postcode = postcode;
    }

    public void setGemeenteNaam(String gemeenteNaam) {
        this.gemeenteNaam = gemeenteNaam;
    }

    public String toString(){
        return postcode + " " + gemeenteNaam;
    }
}
