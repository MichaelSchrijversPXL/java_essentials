package pxl.be.h1.opdracht11;

import java.util.Scanner;

public class BankRekeningApp {
    static void main(String[] args) {
        BankRekening rekening = new BankRekening();
        rekening.setNaam("naam");
        rekening.setCode("BE");
        rekening.setControleCijfers(68);
        rekening.setNummer(539007547834L);
        System.out.println(rekening.getAccount());
        System.out.println(rekening.isGeldig());

        Scanner input = new Scanner(System.in);
        System.out.println("Geef een startbedrag:");
        rekening.setBedrag(input.nextDouble());
        System.out.println("wil je geld afhalen J/N?");
        String antwoord = input.next();
        while (antwoord.equals("J") && !rekening.isLeeg()){
            System.out.printf("Hoeveel geld wil je afhalen (max: %.2f)%n"
                    , rekening.getBedrag());
            rekening.haalAf(input.nextDouble());

            System.out.println("Wil je geld afhalen J/N?");
            antwoord = input.next();
        }
    }
}
