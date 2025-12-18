package oefeningen.oefening1;

public class BandApp {
    static void main() {
        Instrument drum = new Instrument("drum", "boenk baf bonk");
        Instrument klarinet = new Instrument("klarinet", "pftoooooe");
        Instrument gitaar = new Instrument("gitaar", "bow bow bow");
        System.out.println(drum.toString());
        Muzikant heidi = new Muzikant("Heidi", drum);
        Muzikant ingrid = new Muzikant("Ingrid", klarinet);
        Muzikant sam = new Muzikant("Sam", gitaar);
        System.out.println(heidi.toString());
        Muzikant[] leden = new Muzikant[]{heidi, ingrid, sam};
        Band pxl = new Band("PXL digital", leden);
        System.out.println(pxl.toString());
        pxl.speel(20);
    }
}
