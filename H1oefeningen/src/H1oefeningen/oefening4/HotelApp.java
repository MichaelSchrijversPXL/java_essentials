package H1oefeningen.oefening4;

import java.util.Scanner;

public class HotelApp {
    static void main(String[] args) {
        StringBuilder printString = new StringBuilder();
        Scanner input = new Scanner(System.in);
        System.out.print("geef het aantal volwassenen: ");
        int aantalVol = input.nextInt();
        System.out.print("geef het aantal kinderen: ");
        int aantalKind = input.nextInt();
        System.out.print("geef een hotelcode: ");
        String code = input.next();
        while (!code.equals("/")) {
            Hotel hotel = new Hotel();
            hotel.setHotelCode(code);
            System.out.print("geef het aantal sterren: ");
            hotel.setAantalSterren(input.nextInt());
            System.out.print("geef een kindercode: ");
            hotel.setKindercode(input.next().charAt(0));
            printString.append(String.format("%s %5s %4.2f %4.2f %4.2f%n",
                    hotel.getHotelCode(), hotel.getSterren(), hotel.getPrijs(), hotel.getPrijsKind(), aantalKind * hotel.getPrijsKind() + aantalVol * hotel.getPrijs()));

            System.out.print("geef een hotelcode: ");
            code = input.next();
        }
        System.out.println(printString.toString());
    }
}
