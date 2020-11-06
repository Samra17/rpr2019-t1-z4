package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {
    @Test
    void testKonstruktora() {
        Artikl a = new Artikl("Mobitel", 1000,"11");
        assertAll("konstruktor",
                () -> assertEquals("Mobitel", a.getNaziv()),
                () -> assertEquals(1000, a.getCijena()),
                ()  -> assertEquals("11", a.getKod())
                );
    }

}