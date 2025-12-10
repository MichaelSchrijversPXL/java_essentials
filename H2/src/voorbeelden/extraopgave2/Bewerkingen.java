package voorbeelden.extraopgave2;

public class Bewerkingen {
    public static int telop(int[] array){
        int som = 0;
        for(int getal: array){
            som += getal;
        }
        return som;
    }

    public static int trekAf(int[] array){
        int res = array[0];
        for(int i = 1; i < array.length; i++){
            res -= array[i];
        }
        return res;
    }
    public static int vermenigvuldig(int[] array){
        int tot = 1;
        for(int getal: array){
            tot *= getal;
        }
        return tot;
    }
}
