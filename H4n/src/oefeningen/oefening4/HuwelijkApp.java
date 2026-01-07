package oefeningen.oefening4;

public class HuwelijkApp {
    static void main() {
        Persoon persoon1 = new Persoon("test", "test", "test", "test", 3530, "test");
        Persoon persoon2 = new Persoon("test2", "test2", "test2", "test2", 3530, "test2");

        Huwelijk huwelijk = new Huwelijk(persoon1, persoon2);
        System.out.println(huwelijk.toString());
        huwelijk.adresWijziging("wijzig","wijzig",323,"wijzig");
        System.out.println(huwelijk.toString());

    }
}
