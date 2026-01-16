package opdrachten.opdracht11;

public final class Vierkant extends Rechthoek {
    public Vierkant(int x, int y, double h) {
        super(x, y, h, h);
    }

    public Vierkant(double h) {
        super();
        setHoogte(h);
        setBreedte(h);
    }

}
