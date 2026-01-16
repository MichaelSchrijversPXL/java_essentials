package opdrachten.opdracht5;

public class Lector extends Persoon {
    private String personeelsnummer;
    private int aanstellingsPercentage;
    private double salaris;

    public String getPersoneelsnummer() {
        return personeelsnummer;
    }

    public void setPersoneelsnummer(String personeelsnummer) {
        this.personeelsnummer = personeelsnummer;
    }

    public int getAanstellingsPercentage() {
        return aanstellingsPercentage;
    }

    public void setAanstellingsPercentage(int aanstellingsPercentage) {
        if (aanstellingsPercentage < 0) {
            aanstellingsPercentage = 0;
        } else if (aanstellingsPercentage > 100) {
            aanstellingsPercentage = 100;
        }
        int oudPercentage = this.aanstellingsPercentage;
        this.aanstellingsPercentage = aanstellingsPercentage;
        if (oudPercentage != 0) {
            salaris = salaris / oudPercentage * aanstellingsPercentage;
        }
    }

    public double getSalaris() {
        return salaris;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris;
    }

    @Override
    public void print() {
        System.out.printf("Personeelsnummer %s%n", personeelsnummer);
        super.print();
        System.out.printf("Aanstellingspercentage %d%n", aanstellingsPercentage);
        System.out.printf("Salaris %.0f%n", salaris);
    }
}
