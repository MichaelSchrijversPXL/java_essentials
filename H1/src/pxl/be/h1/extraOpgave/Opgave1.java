package pxl.be.h1.extraOpgave;

import java.util.Scanner;

public class Opgave1 {
    static void main(String[] args) {
        for (int i = 10;i<=100; i += 10){
            System.out.printf("%4d", i);
        }
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("geef een grootte in: ");
        int grootte = input.nextInt();
        System.out.print("geef een beginletter in: ");
        char letter = input.next().charAt(0);
        for (int i = 0;i<grootte;i++){
            for (int j = 0; j <= i;j++){
                System.out.printf("%4c", letter);
                letter ++;
                if (letter > 'Z'){
                    letter = 'A';
                }
            }
        }

        java.lang.StringBuilder hulp = new StringBuilder();
        for (char car = 'A'; car <= 'Z'; car++){
            hulp.append(car);
        }
        System.out.println(hulp.toString());
    }
}
