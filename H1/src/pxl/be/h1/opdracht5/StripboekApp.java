package pxl.be.h1.opdracht5;

public class StripboekApp {
    static void main(String[] args) {
        Stripboek strip = new Stripboek();
        strip.setReeks("kuifje");
        strip.setAlbum(32);
        strip.setAuteur("Hergé");
        strip.setTitel("Kuifje in Afrika");

        System.out.println("reeks " + strip.getReeks() + " album "
                + strip.getAlbum() + " Auteur " + strip.getAuteur() + " titel " + strip.getAuteur());
    }
}
