package deel2.oefeningen.oef3;

import java.time.LocalDate;
import java.util.Date;

public class Activiteit {
    private String name;
    private LocalDate date;

    public Activiteit(String name, LocalDate date){
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String toString(){
        return String.format("%TA %TF %s", date, date, name);
    }
}
