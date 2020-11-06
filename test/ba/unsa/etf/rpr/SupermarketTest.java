package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("Biciklo", 1000, "moj kod");
        s.dodajArtikl(a);
        assertEquals ("moj kod",s.getArtikli()[0].getKod());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket k = new Supermarket();
        Artikl a = new Artikl("Mobitel", 1000, "11");
        k.dodajArtikl(a);
        Artikl izbaceni =  k.izbaciArtiklSaKodom("11");
        assertEquals("11", izbaceni.getKod());
    }

    @Test
    void izbaciArtiklSaKodom2(){
        Supermarket k = new Supermarket();
        Artikl a = new Artikl("Mobitel", 1000, "11");
        k.dodajArtikl(a);
        k.dodajArtikl(new Artikl("Laptop", 2000,"12"));
        Artikl izbaceni =  k.izbaciArtiklSaKodom("11");
        assertEquals("11", izbaceni.getKod());
    }

    @Test
    void izbaciArtikKojiNePostoji() {
        Supermarket k = new Supermarket();
        Artikl a = new Artikl("Mobitel", 1000, "11");
        k.dodajArtikl(a);
        assertNull(k.izbaciArtiklSaKodom("12"));
    }
}