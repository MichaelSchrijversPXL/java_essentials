package pxl.be.h1.opdracht7;

public class Planeet {
    private String naam;
    private int diameter;
    private long distanceFromSun;

    // getters
    public String getNaam() {
        return naam;
    }

    public int getDiameter() {
        return diameter;
    }

    public long getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getAstronomischeEenheid(){
        //return (double)distanceFromSun / 149600000; dit is ok
        return distanceFromSun / 149600000.0; //makkelijker
    }

    //setters
    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setDistanceFromSun(long distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }


}
