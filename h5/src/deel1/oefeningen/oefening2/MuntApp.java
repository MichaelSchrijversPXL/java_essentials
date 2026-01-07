package deel1.oefeningen.oefening2;

import java.util.ArrayList;

public class MuntApp {
    static void main() {
        Munt pond = new Munt("briste pond", 0.985212121);
        Munt dollar = new Munt("dollar", 1.2872364546);
        Munt roebel =  new Munt("roebel", 86.9500021);
        Munt euro = new Munt();
        ArrayList<Munt> munten = new ArrayList<Munt>();
        munten.add(pond);
        munten.add(dollar);
        munten.add(roebel);
        munten.add(euro);

        for (Munt munt: munten){
            System.out.print(munt.toString());
        }
    }
}
