package opdracht1;

import java.util.Scanner;

public class DagApp {
    static void main() {
        for(Dag dag: Dag.values()){
            System.out.printf("%s staat op positie %d. het is een ", dag.name(),dag.ordinal());
            if (dag.isWeekdag()){
                System.out.println("weekdag.");
            } else {
                System.out.println("weekenddag.");
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef de eerste dag in ");
        Dag dag1 = Dag.valueOf(scanner.next());
        System.out.println("Geef de tweede dag in ");// moet dan wel exact hetzelfde ingeven als in de opsomming
        Dag dag2 = Dag.valueOf(scanner.next());
        if (dag1 == dag2){
            System.out.println("De 2 dagen zijn gelijk");
        } else {
            System.out.println("niet gelijk");
        }

        if (dag1.ordinal() < dag2.ordinal()){
            System.out.println("dag1 komt voor dag2");
        } else {
            System.out.println("dag1 komt niet voor dag 2");
        }

        int aantal = dag1.ordinal() - dag2.ordinal();
        if(aantal < 0){
            aantal *= -1;
        }
        System.out.printf("aantal dagen verschil %d", aantal);
    }
}
