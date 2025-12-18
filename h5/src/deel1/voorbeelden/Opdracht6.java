package deel1.voorbeelden;

import java.util.Scanner;

public class Opdracht6 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("geef een artikelcode in 2 letters gevold door 2 cijfers");
        String artikelCode = scanner.next();
        if (artikelCode.length() == 4 && Character.isLetter(artikelCode.charAt(0)) && Character.isLetter(artikelCode.charAt(1))
        && Character.isDigit(artikelCode.charAt(2)) && Character.isDigit(artikelCode.charAt(3))){
            artikelCode = Character.toUpperCase(artikelCode.charAt(0)) + artikelCode.substring(1);
            System.out.println(artikelCode);
        } else {
            System.out.println("foutieve ingave");
        }
    }
}
