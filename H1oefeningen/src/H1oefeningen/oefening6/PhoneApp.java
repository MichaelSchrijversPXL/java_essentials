package H1oefeningen.oefening6;

public class PhoneApp {
    public static void main() {
        Phone telefoon = new Phone();
        telefoon.setNumber("0495681012");
        telefoon.setProvider("Floximus");
        for (int i = 10; i <= 30; i++){
            telefoon.call("0121234" + i);
        }
        telefoon.call("070245245");
        System.out.printf("phone cost: %.2f%n", telefoon.getCost());
        telefoon.reset();
        System.out.printf("phone cost after reset: %.2f%n", telefoon.getCost());
    }

}
