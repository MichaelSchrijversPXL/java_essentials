package H1oefeningen.oefening5;

public class SpaceShipApp {
    static void main() {
        SpaceShip galactica = new SpaceShip();
        SpaceShip shade = new SpaceShip();
        galactica.setName("BS Galactica");
        shade.setName("STS Shade");
        galactica.setShieldsOn();
        shade.fire(galactica);
        for (int i = 0; i <= 4; i++){
            galactica.fire(shade);
        }
        System.out.printf("%s is destroyed? %b %n", galactica.getName(), galactica.isDestroyed());
        System.out.printf("%s is destroyed? %b %n", shade.getName(), shade.isDestroyed());
    }
}
