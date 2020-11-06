package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void izbaciArtiklSaKodom() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Mobitel", 1000, "11");
        k.dodajArtikl(a);
        Artikl izbaceni =  k.izbaciArtiklSaKodom("11");
        assertEquals("11", izbaceni.getKod());
    }

    @Test
    void izbaciArtiklKojiNePostoji() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Mobitel", 1000, "11");
        k.dodajArtikl(a);
        //trebam dobiti null u slucaju da pozovem izbaci sa kodom koji nije 11
        Artikl izbaceni = k.izbaciArtiklSaKodom("10");
        assertNull(izbaceni);
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("Mobitel", 1000, "11"));
        k.dodajArtikl(new Artikl("Laptop", 2000, "12"));
        assertEquals(3000, k.dajUkupnuCijenuArtikala());
    }

    @Test
    void dodajArtikl() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("Mobitel", 1000, "11"));
        assertEquals("Mobitel",k.getArtikli()[0].getNaziv());
    }

    @Test
    void preko50Artikala() {
        Korpa k = new Korpa();
        for(int i = 0; i < 50; i++) k.dodajArtikl(new Artikl("Mobitel", 1000, String.valueOf(i)));
        assertFalse(k.dodajArtikl(new Artikl("laptop",2000, "52")));
    }
}