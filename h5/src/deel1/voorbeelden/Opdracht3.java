package deel1.voorbeelden;

import java.util.Random;

public class Opdracht3 {
    static void main(String[] args) {
        Random random = new Random(1203);
        int x = random.nextInt();
        System.out.printf("eerst gegenereerd getal %d%n", x);
        for (int i = 0; i < 20; i++) {
            x = random.nextInt(0, 11);
            System.out.printf("%4d", x);
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            x = random.nextInt(20, 31);
            System.out.printf("%4d", x);
        }
        System.out.println();
        char letter = (char)random.nextInt('a', 'z' + 1);
        System.out.printf("%c is het gegenereerde character", letter);
    }
}
