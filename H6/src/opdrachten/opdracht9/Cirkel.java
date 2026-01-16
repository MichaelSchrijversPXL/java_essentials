package opdrachten.opdracht9;

public class Cirkel extends GrafischElement {
    private double straal;
    private static int teller;

    public Cirkel(int x, int y, int straal) {
        super(x, y);
        this.straal = straal;
        teller++;
    }

    public double getStraal() {
        return straal;
    }

    @Override
    public double getOmtrek() {
        return 2 * Math.PI * straal;
    }

    @Override
    public double getOppervlakte() {
        return Math.PI * straal * straal;
    }

    @Override
    public String toString(){
        return String.format("De cirkel met middelpunt (%d,%d) en straal %.1f", getX(),getY(),straal);
    }

    public static int getTeller(){
        return teller;
    }
}
