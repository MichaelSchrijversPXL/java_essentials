package gemeente_tests;

import oefeningen.oefening4.Adres;
import oefeningen.oefening4.Persoon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersoonTest {

    public static final String VOORNAAM = "Ann";
    public static final String NAAM = "Vandewalle";


    private Persoon persoon1;
    private Persoon persoon2;

    @Before
    public void init() {
        persoon1 = new Persoon(NAAM, VOORNAAM,   AdresTest.STRAATNAAM, AdresTest.HUISNUMMER, GemeenteTest.POSTCODE, GemeenteTest.GEMEENTENAAM);
        persoon2 = new Persoon(NAAM, VOORNAAM,  new Adres(AdresTest.STRAATNAAM, AdresTest.HUISNUMMER, GemeenteTest.POSTCODE, GemeenteTest.GEMEENTENAAM));
    }

    @Test
    public void testNamenNaConstructor1() {
        assertEquals(VOORNAAM, persoon1.getVoornaam());
        assertEquals(NAAM, persoon1.getNaam());
    }


    @Test
    public void testAdresNaConstructor1() {
        assertEquals(AdresTest.STRAATNAAM, persoon1.getAdres().getStraat());
        assertEquals(AdresTest.HUISNUMMER, persoon1.getAdres().getHuisnummer());
        assertEquals(GemeenteTest.POSTCODE, persoon1.getAdres().getGemeente().getPostcode());
        assertEquals(GemeenteTest.GEMEENTENAAM, persoon1.getAdres().getGemeente().getGemeenteNaam());
    }

    @Test
    public void testNamenNaConstructor2() {
        assertEquals(VOORNAAM, persoon2.getVoornaam());
        assertEquals(NAAM, persoon2.getNaam());
    }


    @Test
    public void testAdresNaConstructor2() {
        assertEquals(AdresTest.STRAATNAAM, persoon2.getAdres().getStraat());
        assertEquals(AdresTest.HUISNUMMER, persoon2.getAdres().getHuisnummer());
        assertEquals(GemeenteTest.POSTCODE, persoon2.getAdres().getGemeente().getPostcode());
        assertEquals(GemeenteTest.GEMEENTENAAM, persoon2.getAdres().getGemeente().getGemeenteNaam());
    }

    @Test
    public void testPersoonToString() {
        String expected = VOORNAAM + " " + NAAM + "\r\n" + AdresTest.STRAATNAAM + " " + AdresTest.HUISNUMMER + "\r\n" + GemeenteTest.POSTCODE + " " + GemeenteTest.GEMEENTENAAM;
        assertEquals(expected, persoon1.toString());
    }
}
