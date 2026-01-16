package oefeningen.oef2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SportApp {
    static void main() {
        ArrayList<Sporter> sporters = new ArrayList<>();
        sporters.add(new Sporter("Heesters", "Lisa", "Fitness"));
        sporters.add(new Voetballer("Vos", "Joren", "KSHasselt", "verdediger"));
        sporters.add(new Sporter("Gilis", "Bernard", "zwemmen"));
        sporters.add(new Voetballer("Hox", "Martijn"));
        sporters.add(new Voetballer("Vaes", "Romano", "KV Bree", "aanvaller"));
        sporters.add(new Voetballer("deTester", "test"));
        sporters.add(new Sporter("Jordan", "Michael", "basketbal"));
        sporters.add(new Sporter("Leen", "Adams"));
        sporters.add(new Voetballer("Vos", "Niels", "KSKHasselt", "aanvaller"));
        sporters.add(new Sporter("deLaatste", "input", "programmeren"));
        ArrayList<Voetballer> middenvelders = new ArrayList<>();
        ArrayList<Voetballer> aanvallers = new ArrayList<>();
        ArrayList<Voetballer> verdedigers = new ArrayList<>();
        ArrayList<Voetballer> onbepaalden = new ArrayList<>();

        // polymorfisme
        for (Sporter sporter : sporters) {
            if (!(sporter instanceof Voetballer)) {
                sporter.print();
            } else {
                switch (((Voetballer) sporter).getOpstelling()) {
                    case "middenvelder":
                        middenvelders.add((Voetballer) sporter);
                        break;
                    case "aanvaller":
                        aanvallers.add((Voetballer) sporter);
                        break;
                    case "verdediger":
                        verdedigers.add((Voetballer) sporter);
                        break;
                    default:
                        onbepaalden.add((Voetballer) sporter);
                        break;
                }
            }
        }
        String[] opstellingen = Voetballer.getToegelaten();
        ArrayList<ArrayList<Voetballer>> voetballers = new ArrayList<ArrayList<Voetballer>>();
        voetballers.add(middenvelders);
        voetballers.add(aanvallers);
        voetballers.add(verdedigers);
        voetballers.add(onbepaalden);

        for (int i =0; i < opstellingen.length; i++){
            if (voetballers.get(i).size() > 0){
                System.out.printf("******* %s ********\n", opstellingen[i]);
            }
            for (int j = 0; j < voetballers.get(i).size(); j++){
                voetballers.get(i).get(j).print();
            }
        }
    }
}
