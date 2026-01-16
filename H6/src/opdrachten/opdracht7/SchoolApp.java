package opdrachten.opdracht7;

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
        Student bilal = new Student("hira", "bilal","TIN", "1566441");
        Lector amber = new Lector("amber", "ahmed", 40,1500);
        Persoon[] personen = {persoon, axel, lector, bilal, amber};
        for(Persoon person: personen){
            person.print();
        }

        System.out.println(Persoon.getAantalPersonen());
        System.out.println(Student.getAantal());
        System.out.println(Lector.getAantal());
    }
}
