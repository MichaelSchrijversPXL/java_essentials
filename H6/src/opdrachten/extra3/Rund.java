package opdrachten.extra3;

import java.time.LocalDate;

public class Rund extends Dier {
    private boolean melkKoe;
    private static int aantal;

    public Rund(boolean melkKoe, LocalDate geboorteDatum){
        super("koer", "herbivoor", geboorteDatum);
        this.melkKoe = melkKoe;
        aantal++;
    }

    public Rund(){
        super("koe", "herbivoor", LocalDate.now());
        aantal++;
    }

    public boolean isMelkKoe() {
        return melkKoe;
    }

    public static int getAantal(){
        return aantal;
    }

    public void print(){
        super.print();
        if (melkKoe){
            System.out.println("het is een melk koe");
        } else {
            System.out.println("het is een vlees koe");
        }
    }

    public String maakGeluid(){
        return "moooooo";
    }

    @Override
    public String toString(){
        StringBuilder bob = new StringBuilder();
        bob.append(super.toString());
        if (melkKoe){
            bob.append(" het is een melkkoe.");
        } else {
            bob.append(" het is een vleeskoe.");
        }
        return bob.toString();
    }
}
