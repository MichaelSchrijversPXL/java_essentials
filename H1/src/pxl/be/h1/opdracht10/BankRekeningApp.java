package pxl.be.h1.opdracht10;

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

    }
}
