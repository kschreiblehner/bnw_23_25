package model;

public class Bestellung {
    int bestellnummer;
    float gesamtPreis;
    float rabatt;
    Artikel[] artikel;

    // Position des zuletzt eingefuegten Artikels
    int lastArtikelPosition;

    public Bestellung(int bestellnummer) {
        this.bestellnummer = bestellnummer;
        // Gesamtpreis sollte initial gleich 0 sein.
        this.gesamtPreis = 0.f;
        // Rabatt gibt es nicht
        this.rabatt = 0.f;
        // Es sind maximal 50 Artikel erlaubt
        this.artikel = new Artikel[50];
        this.lastArtikelPosition = -1;
    }

    public float berechneGesamtPreis() {
        float summe = 0.f;

        for(int i = 0; i < artikel.length; i++) {
            if (artikel[i] != null) {
                summe += artikel[i].getPreis();
            }
        }
        return summe;
    }

    public boolean addArtikel(Artikel artikel) {
        if (this.lastArtikelPosition < this.artikel.length-1) {
            this.artikel[++this.lastArtikelPosition] = artikel;  // fuege den neuen artikel ein
            this.gesamtPreis += artikel.getPreis();  // erhoehe automatisch den Gesamtpreis
            return true;
        } else {
            return false;
        }
    }

    public float getGesamtPreis() {
        return this.gesamtPreis;
    }
}
