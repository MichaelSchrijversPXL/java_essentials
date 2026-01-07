package deel2.oefeningen.oef2;

import java.util.Random;

public class BingoApp {
    static void main() {
        BingoKaart sam = new BingoKaart("Sam");
        BingoKaart sander = new BingoKaart("Sander");
        BingoKaart nele = new BingoKaart("Nele");
        BingoKaart[] bingoKaarten = {sam, sander, nele};
        Random hulp = new Random(120);
        for (BingoKaart bingoKaart : bingoKaarten) {
            for (int i = 0; i < 6; i++) {
                bingoKaart.addNumber(hulp.nextInt(0,101));
            }
            System.out.println(bingoKaart.toString());
        }

        boolean eind = true;
        while (eind){
            int getal = hulp.nextInt(0,101);
            System.out.printf("Nummer %d getrokken.....\n", getal);
            for (BingoKaart bingoKaart: bingoKaarten){
                if (bingoKaart.hasNumber(getal)){
                    System.out.println("BINGO!!!");
                    eind = false;
                    System.out.println(bingoKaart.toString());
                    return;
                }
            }
        }

    }

}
