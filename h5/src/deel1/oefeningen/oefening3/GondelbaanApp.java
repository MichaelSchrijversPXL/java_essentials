package deel1.oefeningen.oefening3;

public class GondelbaanApp {
    static void main(String[] args) {
        Gondelbaan test = new Gondelbaan("Dit iS een NasM", "Frankrijk", 5,10);
        System.out.println(test.toString());
        System.out.println(test.getSnelheid());
    }
}
