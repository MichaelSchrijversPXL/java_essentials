package H1oefeningen.oefening5;

public class Spaceship {
    private String name;
    private int hits;
    boolean shieldsOn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public boolean isShieldsOn() {
        return shieldsOn;
    }

    public void setShieldsOn() {
        this.shieldsOn = true;
        System.out.printf("%s turns shields on%n", name);
    }

    public void setShieldsOff(){
        this.shieldsOn = false;
    }

    public void fire(Spaceship spaceship) {
        if (spaceship.isShieldsOn()) {
            this.hits++;
            System.out.printf("%s fires at %s but shields are on%n", this.name, spaceship.name);
        } else {
            spaceship.setHits(spaceship.getHits() + 1);
            System.out.printf("%s fires at %s%n", this.name, spaceship.name);
        }
    }

    public boolean isDestroyed() {
        if (this.hits >= 5)
            return true;
        return false;
    }
}
