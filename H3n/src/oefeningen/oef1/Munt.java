package oefeningen.oef1;

public enum Munt {
    EENCENT(1),TWEECENT(2), VIJFCENT(5), TIENCENT(10),TWINTIGCENT(20),VIJFTIGCENT(50),EENEURO(100), TWEEEURO(200);

    private int waarde;

    private Munt(int waarde){
        this.waarde = waarde;
    }

    public int getWaarde(){
        return waarde;
    }
}
