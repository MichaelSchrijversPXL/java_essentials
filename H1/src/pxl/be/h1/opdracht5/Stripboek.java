package pxl.be.h1.opdracht5;

public class Stripboek {
    private String reeks;
    private String titel;
    private int album;
    private String auteur;

    public void setReeks(String reeks){
        this.reeks = reeks;
    }

    public void setTitel(String titel){
        this.titel = titel;
    }

    public void setAlbum(int album){
        this.album = album;
    }

    public void setAuteur(String auteur){
        this.auteur = auteur;
    }

    public String getReeks(){
        return reeks;
    }

    public int getAlbum(){
        return album;
    }

    public String getTitel(){
        return titel;
    }

    public String getAuteur(){
        return auteur;
    }
}
