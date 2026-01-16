package opdrachten.opdracht7;

public class Student extends Persoon {
    private int leerkrediet = 140;
    private String studentNummer;
    private String opleiding;
    private static int aantal;

    public Student(String naam, String voornaam, String opleiding, String studentNummer) {
        super(naam, voornaam);
        this.opleiding = opleiding;
        this.studentNummer = studentNummer;
        aantal++;
    }

    public static int getAantal() {
        return aantal;
    }

    public Student(String naam, String voornaam) {
        this(naam, voornaam, "TIN", "19899999");
    }

    public Student() {
        this("onbekend", "onbekend");
    }

    public Student(Student student) {
        this(student.getNaam(), student.getVoornaam(), student.getOpleiding(), student.getStudentNummer());
    }

    public void setLeerkrediet(int leerkrediet) {
        this.leerkrediet += leerkrediet;
        if (this.leerkrediet < 0) {
            this.leerkrediet = 0;
        } else if (this.leerkrediet > 140) {
            this.leerkrediet = 140;
        }
    }

    public void setStudentNummer(String studentNummer) {
        this.studentNummer = studentNummer;
    }

    public void setOpleiding(String opleiding) {
        this.opleiding = opleiding;
    }

    public int getLeerkrediet() {
        return leerkrediet;
    }

    public String getStudentNummer() {
        return studentNummer;
    }

    public String getOpleiding() {
        return opleiding;
    }

    public void print() {
        System.out.println("studentnummer: " + studentNummer);
        super.print();
        System.out.println("opleiding: " + opleiding);
        System.out.println("leerkrediet " + leerkrediet);
    }

}
