package opdrachten.opdracht5;

public class SchoolApp {
    static void main() {
        Persoon persoon = new Persoon();
        Student student = new Student();
        student.setNaam("Schrijvers");
        student.setVoornaam("Raaz");
        System.out.printf("Student %s %s%n", student.getVoornaam(), student.getNaam());
        student.setOpleiding("TIN");
        student.setStudentNummer("11801874");
        student.setLeerkrediet(200);
        student.setLeerkrediet(-20);

        System.out.printf("Studentnummer %s volgt de opleiding %s%n", student.getNaam(), student.getOpleiding());
        System.out.printf("en heeft een leerkrediet %d %n", student.getLeerkrediet());
        //polymorf object een hoge klasse die als subklasse instantiated word
        Persoon axel = new Student();
        axel.setNaam("niet");
        axel.setVoornaam("axel");
        ((Student) axel).setStudentNummer("11801874");
        Lector lector = new Lector();
        lector.setNaam("mahmdani");
        lector.setVoornaam("zohran");
        lector.setPersoneelsnummer("21801259");
        lector.print();
        Persoon[] personen = {persoon, axel, lector};
        for(Persoon person: personen){
            person.print();
        }


    }
}
