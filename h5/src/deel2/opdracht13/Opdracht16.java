package deel2.opdracht13;

public class Opdracht16 {
    public static void main(String[] args) {
        String[][] words = {{"How ", "What’s ", "Let "},
                {"are ", "your ", "me "},
                {"you?", "name?", "try."}};
        for (int j = 0; j < words[0].length; j++){
            for (int i = 0; i < words.length; i++){
                System.out.print(words[i][j]);
            }
            System.out.println();
        }
    }
}
