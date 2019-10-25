package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {

        Supermarket supermarket = new Supermarket();

        for(int i=0 ; i < 1000; i++)
            supermarket.dodajArtikl(new Artikl("Pidzama", i + 50, "1" + i%50));

        assertFalse(supermarket.dodajArtikl(new Artikl("a", 10, "0")));
    }

    @Test
    void izbaciArtiklSaKodomDaNeMoze() {
        Supermarket supermarket = new Supermarket();

        assertNull(supermarket.izbaciArtiklSaKodom("1"));
    }

    @Test
    void izbaciArtiklSaKodomDaMoze() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("a", 10, "1"));
        assertEquals( "1", supermarket.izbaciArtiklSaKodom("1").getKod());
    }
}