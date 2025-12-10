package H1oefeningen.oefening7;

import java.util.Scanner;

public class SwordApp {
    static void main() {
        Sword[] swords = new Sword[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            swords[i] = new Sword();
            System.out.print("Enter a material ");
            swords[i].setMaterial(input.next());
            System.out.print("Enter a durability ");
            swords[i].setDurability(input.nextInt());
        }
        System.out.println("| Materiaal| Duurzaamheid|");
        Sword highestDurability = swords[0];
        for(int i = 0; i < swords.length; i++){
            if (swords[i].getDurability() > highestDurability.getDurability())
                highestDurability = swords[i];
            System.out.printf("| %9s| %12d|%n", swords[i].getMaterial(), swords[i].getDurability());
        }
        System.out.printf("The most durable sword is made out of %s", highestDurability.getMaterial());
    }
}
