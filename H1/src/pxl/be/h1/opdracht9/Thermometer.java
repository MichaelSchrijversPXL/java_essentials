package pxl.be.h1.opdracht9;

public class Thermometer {
    private double temperatuur;

    public double getTemperatuur() {
        return temperatuur;
    }

    public double getFahrenheit() {
        return 9.0 / 5 * temperatuur + 32;
    }

    public void setTemperatuur(double temperatuur) {
        this.temperatuur = temperatuur;
    }

}
