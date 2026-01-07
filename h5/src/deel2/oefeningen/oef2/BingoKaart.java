package deel2.oefeningen.oef2;

import java.util.ArrayList;

public class BingoKaart {
    private String name;
    private ArrayList<Integer> numbers;

    public BingoKaart(String name){
        this.name = name;
        numbers = new ArrayList<Integer>();
        //dit is niet nodig aangezien we hier gwn de naam ingeven
        // dus split de op de ,spatie en haal de haakjes weg
//        String[] numberSeq = bingo.substring(bingo.indexOf("(") + 1, bingo.length() -1 ).split(", ");
//        // denk dat ik mogelijk de haakjes en de spaties niet had moeten weghalen want parseint haalt enkel de int eruit
//        // TODO: herschrijf dit mogelijk later
//        for (String numb: numberSeq){
//            addNumber(Integer.parseInt(numb));
//        }
    }

    public void addNumber(int number){
        numbers.add(number);
    }

    public boolean hasNumber(int number){
        for (int num:numbers){
            if (num == number){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        StringBuilder bob = new StringBuilder(name + " (");
        bob.append(numbers.get(0));
        for (int i = 1; i < numbers.size(); i++){
            bob.append(", ").append(numbers.get(i));
        }
        bob.append(")");
        return bob.toString();
    }
}
