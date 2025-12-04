package pxl.be.h1.opdracht13;

public class Verkoper {
    private String naam;
    private double[] verkoopcijfers = new double[12];

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setVerkoopcijfers(double[] verkoopcijfers) {
        this.verkoopcijfers = verkoopcijfers;
    }

    public void setVerkoopMaand(int maandnr, double bedrag){
        verkoopcijfers[maandnr - 1] = bedrag;
    }

    public String getNaam() {
        return naam;
    }

    public double[] getVerkoopcijfers() {
        return verkoopcijfers;
    }

    public double getTotaalVerkocht(){
        double som = 0;
        for (double cijfer: verkoopcijfers){
            som += cijfer;
        }
        return som;
    }

    public double getGemiddeldVerkocht(){
        return this.getTotaalVerkocht() / verkoopcijfers.length;
    }


}
