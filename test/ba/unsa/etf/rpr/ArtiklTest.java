package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl artikl = new Artikl("Pidzama", 15, "55");
        assertEquals("Pidzama", artikl.getNaziv());
    }

    @Test
    void getCijena() {
        Artikl artikl = new Artikl("Pidzama", 15, "55");
        assertEquals(15, artikl.getCijena());
    }

    @Test
    void getKod() {
        Artikl artikl = new Artikl("Pidzama", 15, "55");
        assertEquals("55", artikl.getKod());
    }
}