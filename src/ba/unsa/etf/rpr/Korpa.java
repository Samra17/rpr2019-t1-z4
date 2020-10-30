package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl artikli[] = new Artikl[50];
    private int brojArtikalaUKorpi = 0;

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i = 0; i < brojArtikalaUKorpi; i++) {
            if(artikli[i].getKod().equals(kod)) {
                Artikl a = artikli[i];
                for(int j = i + 1; j < brojArtikalaUKorpi; j++) artikli[j-1] = artikli[j];
                brojArtikalaUKorpi = brojArtikalaUKorpi - 1;
                artikli[brojArtikalaUKorpi] = null;
                return a;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int cijena = 0;
        for(int i = 0; i < brojArtikalaUKorpi; i++) cijena = cijena + artikli[i].getCijena();
        return cijena;
    }

    public boolean dodajArtikl(Artikl a) {
        if(brojArtikalaUKorpi == 50) return  false;
        artikli[brojArtikalaUKorpi] = a;
        brojArtikalaUKorpi = brojArtikalaUKorpi + 1;
        return true;
    }
}
