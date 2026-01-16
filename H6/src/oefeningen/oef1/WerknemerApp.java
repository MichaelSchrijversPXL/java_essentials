package oefeningen.oef1;

public class WerknemerApp {
    static void main() {
        Werknemer werknemer1 = new Werknemer("Michael", "Schrijvers");
        Werknemer werknemer2 = new Werknemer("Lisa", "Heesters", "graduaat", 2);
        Manager manager = new Manager("Wendy", "Vandingenen", "sales manager", 2800, 200);
        Werknemer[] werknemers = {werknemer1, werknemer2, manager};
        for (Werknemer werkn: werknemers){
            werkn.print();
        }
        System.out.println();
        System.out.println(Manager.getProcAandeelManagers());
    }
}
