package oefeningen.oef3.JE_H2_Constructors_startbestanden;

public class Character {
    private static int count = 0;
    private static final int MAX_TITLES = 3;
    private String firstName;
    private String lastName;
    private String nickname;
    private String house;
    private int firstSeason;
    private int lastSeason;
    private int episodes;
    private String portrayedBy;
    private int numberOfTitles;
    private String[] titles = new String[MAX_TITLES];
    //
    public Character(String firstName, String lastName, String house, String portrayedBy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.house = house;
        this.portrayedBy = portrayedBy;
        count++;
    }

    public Character(String firstName, String lastName, String nickname,String house, String portrayedBy) {
        this(firstName, lastName, house, portrayedBy);
        this.nickname = nickname;
    }

    public Character(String firstName, String lastName, String nickname,String house, int firstSeason, int lastSeason, int episodes,String portrayedBy) {
        this(firstName, lastName, nickname, house, portrayedBy);
        this.firstSeason = firstSeason;
        this.lastSeason = lastSeason;
        this.episodes = episodes;
    }

    public static  int getCount(){
        return count;
    }

    public void setData(int firstSeason, int lastSeason, int episodes){
        this.firstSeason = firstSeason;
        this.lastSeason = lastSeason;
        this.episodes = episodes;
    }

    public void addTitle(String title){
        if (numberOfTitles <= MAX_TITLES){
            numberOfTitles++;
            titles[numberOfTitles - 1] = title;
        } 
    }
    
    @Override
    // nickname ook testen
    public String toString(){
        StringBuilder hulp = new StringBuilder();
        hulp.append(String.format("%s \"%s\" %s of house %s%n", firstName, nickname,lastName,house));
        for (int i = 0; i < numberOfTitles; i++){
            hulp.append(String.format("*** \"%s\"%n", titles[i]));
        }
        hulp.append(String.format("Played by: %s", portrayedBy));
        // onder elke situatie als firstseason is ingegeven is de rest dat ook
        //setdata vereist alle 3 constructor ook dus moeten maar voor 1 checken
        if(firstSeason != 0){
            hulp.append((String.format(" in season %d-%d (%d episodes)", firstSeason, lastSeason, episodes)));
        }
        return hulp.toString();
    }



    

    

    
    
}
