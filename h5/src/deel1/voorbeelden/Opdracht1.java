package deel1.voorbeelden;

import java.util.Scanner;

public class Opdracht1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een geheel getal in: ");
        int x = scanner.nextInt();
        x = (int)Math.pow(x,3);
        System.out.println();
        System.out.printf("De derde macht van dit getal is %d%n", x);
    }
}
