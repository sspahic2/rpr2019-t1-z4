package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Supermarket {
   private Artikl[] artikli = new Artikl[1000];
   private int brojac = 0;

    public Artikl[] getArtikli() {
        return artikli;
    }

    public boolean dodajArtikl(Artikl prima) {
        if(brojac >= 50)
            return false;

        artikli[brojac] = prima;
        brojac++;
        return true;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i = 0; i < brojac; i++) {
            if(artikli[i].getKod().equals(kod)) {
                Artikl vraca = artikli[i];
                for(int j = i; j < brojac; j++) {
                    Artikl temp = artikli[j];
                    artikli[j] = artikli[j + 1];
                    artikli[j + 1] = temp;
                }
                brojac--;
                return vraca;
            }
        }
        return null;
    }
}
