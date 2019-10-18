package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Korpa {
    private Artikl[]  artikli = new Artikl[50];
    private int brojac = 0;

    public Artikl[] getArtikli() {
        return artikli;
    }


    public boolean dodajArtikl(Artikl a) {

        if(brojac >= 50)
            return false;

        artikli[brojac] = a;
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


    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for(int i = 0; i < brojac; i++)
            suma += artikli[i].getCijena();

        return suma;
    }
}
