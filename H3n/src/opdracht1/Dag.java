package opdracht1;

public enum Dag {
    MAANDAG,DINSDAG,WOENSDAG,DONDERDAG,VRIJDAG,ZATERDAG(false),ZONDAG(false);

    private boolean weekdag = true;

    private Dag(boolean weekdag){
        this.weekdag = weekdag;
    }

    private Dag(){}

    public boolean isWeekdag(){
        return weekdag;
    }
}
