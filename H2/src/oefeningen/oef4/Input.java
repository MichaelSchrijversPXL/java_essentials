package oefeningen.oef4;

import java.util.Scanner;

public class Input {
    //
    private static Scanner scanner;

    public static Scanner getScanner(){
        if (scanner != null){
            return scanner;
        }
        scanner = new Scanner(System.in);
        return scanner;
    }

    public static String readLine(){
        return getScanner().nextLine();
    }

    public static String readLine(String msg){
        System.out.println(msg);
        return readLine();
    }

    public static int readInt(){
        int x = getScanner().nextInt();
        getScanner().nextLine();
        return x;
    }

    public static int readInt(String msg){
        System.out.println(msg);
        return readInt();
    }
}
