package pxl.be.h1.opdracht7;

public class PlaneetApp {
    static void main(String[] args) {
        Planeet mars = new Planeet();
        mars.setNaam("Mars");
        mars.setDiameter(6779);
        mars.setDistanceFromSun(227000000);

        Planeet neptunus = new Planeet();
        neptunus.setNaam("neptunus");
        neptunus.setDiameter(49528);
        neptunus.setDistanceFromSun(4495100000L);

        if (mars.getDistanceFromSun() < neptunus.getDistanceFromSun()){
            System.out.println(mars.getNaam() + " staat dichter bij de zon "
                    + mars.getAstronomischeEenheid() +"AE");
        } else {
            System.out.println(neptunus.getNaam() + " staat dichter bij de zon "
                    + neptunus.getAstronomischeEenheid() +"AE");
        }
    }
}
