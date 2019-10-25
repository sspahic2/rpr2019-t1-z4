package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa korpa = new Korpa();

        for(int i=0 ; i < 50; i++)
            korpa.dodajArtikl(new Artikl("Pidzama", i + 50, "1" + i));

        assertFalse(korpa.dodajArtikl(new Artikl("a", 10, "0")));
    }

    @Test
    void izbaciArtiklSaKodomDaNeMoze() {
        Korpa korpa = new Korpa();

        assertNull(korpa.izbaciArtiklSaKodom("10"));
    }

    @Test
    void izbaciArtiklSaKodomDaMoze() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("a", 10, "1"));
        korpa.dodajArtikl(new Artikl("b", 11, "2"));
        korpa.dodajArtikl(new Artikl("c", 12, "3"));

        Artikl artikl = new Artikl("b", 11, "2");
        assertEquals( "2", korpa.izbaciArtiklSaKodom("2").getKod());
    }
}