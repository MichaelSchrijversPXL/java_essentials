package opdrachten.opdracht1;

public class Student extends Persoon{
    private int leerkrediet;
    private String studentNummer;
    private String opleiding;

    public void setLeerkrediet(int leerkrediet) {
        this.leerkrediet += leerkrediet;
        if (this.leerkrediet < 0){
            this.leerkrediet = 0;
        } else if (this.leerkrediet > 140){
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

}
