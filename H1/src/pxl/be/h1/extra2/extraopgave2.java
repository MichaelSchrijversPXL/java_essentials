package pxl.be.h1.extra2;

public class extraopgave2 {
    static void main() {
        int[] array1 = new int[20];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (i + 1) * 7;
        }

        for (int getal : array1) {
            System.out.printf("%4d", getal);
        }
        System.out.println();

        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i * 2 + 1;
        }
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.printf("%4d", array2[i]);
        }
        System.out.println();
    }
}
