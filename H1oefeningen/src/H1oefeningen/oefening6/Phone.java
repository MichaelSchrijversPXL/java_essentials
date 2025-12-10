package H1oefeningen.oefening6;

public class Phone {
    private String number;
    private String provider;
    private int numberOfCalls;
    private int numberOfFreeCalls;

    public String getNumber() {
        return number;
    }

    public String getProvider() {
        return provider;
    }

    public int getNumberOfCalls() {
        return numberOfCalls;
    }

    public int getNumberOfFreeCalls() {
        return numberOfFreeCalls;
    }

    public double getCost() {
        if (provider.equalsIgnoreCase("floximus")) {
            double cost = 0.25 * numberOfCalls;
            if (numberOfCalls > 20)
                cost *= 0.95;
            return cost;
        }
        return numberOfCalls * 0.21;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }


    public void call(String nummer) {
        System.out.printf("calling %s%n", nummer);
        if (nummer.equals("112") || nummer.equals("102") || nummer.equals("070245245"))
            numberOfFreeCalls++;
        else
            numberOfCalls++;
    }

    public void reset(){
        numberOfCalls = 0;
        numberOfFreeCalls = 0;
    }
}
