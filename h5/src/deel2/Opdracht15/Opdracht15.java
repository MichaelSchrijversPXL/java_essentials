package deel2.Opdracht15;

public class Opdracht15 {
    static void main() {
        int[][] x = new int[4][6];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int[] rij : x) {
            for (int getal : rij) {
                System.out.printf("%4d", getal);
            }
            System.out.println();
        }

        for(int j = 0; j < x[0].length; j++){
            int som = 0;
            for (int i = 0; i < x.length; i++){
                som += x[i][j];
            }
            System.out.println(som);
        }
    }
}
