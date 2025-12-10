package H1oefeningen.oefening5;

public class SpaceShip {
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

    public void fire(SpaceShip spaceship) {
        if (spaceship.isShieldsOn()) {
            this.hits++;
            System.out.printf("%s fires at %s but shields are on%n", this.name, spaceship.name);
        } else {
            spaceship.hits++;
            System.out.printf("%s fires at %s%n", this.name, spaceship.name);
        }
    }

    public boolean isDestroyed() {
        return this.hits >= 5;
    }
}
