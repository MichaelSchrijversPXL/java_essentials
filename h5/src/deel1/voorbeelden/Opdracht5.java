package deel1.voorbeelden;

import java.util.Scanner;

public class Opdracht5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("geef een regel tekst in ");
        String tekst1 = scanner.nextLine();
        System.out.printf("%s heeft %d karakters.%n", tekst1, tekst1.length());
        tekst1 = tekst1.replace('a', 'o');
        System.out.println();

        int index = tekst1.indexOf("e");
        int tel = 0;
        while (index != -1){
            tel++;
            index = tekst1.indexOf("e", index + 1);
        }
        System.out.printf("er staan %d letter e in de tekst.%n",tel);
        String tekst2 = scanner.nextLine();
        if (tekst1.equals(tekst2)){
            System.out.println("inhoud is hetzelfde");
        } else {
            System.out.println("inhoud is verschillend");
        }
        System.out.println();
        String woord = scanner.next();
        int lengte = woord.length();
        int begin;
        int einde;

        if (lengte % 2 == 0){
            begin = lengte/2-1;
            einde = begin + 1;
        } else {
            begin = lengte/2;
            einde = begin + 1;
        }

        woord = woord.substring(0,begin) + woord.substring(begin, einde) + woord.substring(einde);
        System.out.println(woord);
    }
}
