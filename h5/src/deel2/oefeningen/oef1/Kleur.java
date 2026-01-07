package deel2.oefeningen.oef1;

public class Kleur {
    private int rood;
    private int groen;
    private int blauw;
    private String hex;

    public Kleur(String hex){
        this.hex = hex;
        hexToRGB();

    }

    public Kleur(int rood, int groen, int blauw){
        this.rood = rood;
        this.groen = groen;
        this.blauw = blauw;
        RGBToHex();
    }

    public void setRGB(int rood, int groen, int blauw){
        this.rood = rood;
        this.groen = groen;
        this.blauw = blauw;
    }

    public void setHex(String hex) {
        if (hex.charAt(0) != '#'){
            System.out.println("Invalid hex format");
            return;
        }
        this.hex = hex;
    }

    public String toString(){
        return String.format("%d %d %d\n%s", rood, groen, blauw, hex);
    }

    private void hexToRGB(){
        rood = Integer.parseInt(hex.substring(1,3),16);
        groen = Integer.parseInt(hex.substring(3,5),16);
        blauw = Integer.parseInt(hex.substring(5),16);
    }

    private void RGBToHex(){
        StringBuilder bob = new StringBuilder("#");
        bob.append(Integer.toHexString(rood)).append(Integer.toHexString(groen)).append(Integer.toHexString(blauw));
        hex = bob.toString();
    }
}
