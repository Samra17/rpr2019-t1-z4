package ba.unsa.etf.rpr;

public class Supermarket {

    private Artikl supermarket[] = new Artikl[1000];
    private  int trenutnoStanjeArtikala = 0;

    public void dodajArtikl(Artikl artikl) {
        supermarket[trenutnoStanjeArtikala] = artikl;
        trenutnoStanjeArtikala = trenutnoStanjeArtikala + 1;
    }

    public Artikl[] getArtikli() {
        return supermarket;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i = 0; i < trenutnoStanjeArtikala; i++) {
            if(supermarket[i].getKod().equals(kod)) {
                Artikl a = supermarket[i];
                for(int j = i+1; j < trenutnoStanjeArtikala; j++ )
                    supermarket[j-1] = supermarket[j];
                supermarket[trenutnoStanjeArtikala] = null;
                return a;
            }
        }
        return null;
    }
}
