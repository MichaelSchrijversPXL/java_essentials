package deel1.voorbeelden;

import java.util.ArrayList;
import java.util.Scanner;

public class Opdracht8 {
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i<3;i++){
            System.out.println();
            String woord = "voorbeeld" + " " + (i + 1);
            list.add(woord);
        }
        System.out.println(list);
        list.set(1,"gewijzigd");
        System.out.println(list);
//        list.remove(1);
        list.remove("gezijzigd");
        int index = list.indexOf("voorbeeld 3");
        System.out.printf("%d is de positie van voorbeeld 3%n", index);
        for (String woord: list){
            System.out.printf("%s ", woord);
        }
        System.out.println();

    }
}
