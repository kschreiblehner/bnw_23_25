package model;

public class Bestellung {
    private int bestellnummer;
    private float gesamtPreis;
    private float rabatt;
    private Artikel[] artikel;

    // Position des zuletzt eingefuegten Artikels
    private int lastArtikelPosition;

    public Bestellung(int bestellnummer) {
        this.bestellnummer = bestellnummer;
        // Gesamtpreis sollte initial gleich 0 sein.
        this.gesamtPreis = 0.f;
        // Rabatt gibt es nicht
        this.setRabatt(0.f);
        // Es sind maximal 50 Artikel erlaubt
        this.setArtikel(new Artikel[50]);
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

    public int getBestellnummer() {
        return bestellnummer;
    }

    public void setBestellnummer(int bestellnummer) {
        this.bestellnummer = bestellnummer;
    }

    public float getGesamtPreis() {
        return gesamtPreis;
    }

    public void setGesamtPreis(float gesamtPreis) {
        this.gesamtPreis = gesamtPreis;
    }

    public float getRabatt() {
        return rabatt;
    }

    public void setRabatt(float rabatt) {
        if (rabatt >= 0.f && rabatt <= 1.0f) {
            this.rabatt = rabatt;
        } else {
            System.err.println("Rabatt muss im Intervall [0,1] sein.");
        }
    }

    public Artikel[] getArtikel() {
        return artikel;
    }

    public void setArtikel(Artikel[] artikel) {
        if (artikel.length <= 50) {
            this.artikel = artikel;
        } else {
            System.err.println("Maximale Anzahl Artikel ist gleich 50.");
        }
    }

    public int getLastArtikelPosition() {
        return lastArtikelPosition;
    }

    public void setLastArtikelPosition(int lastArtikelPosition) {
        this.lastArtikelPosition = lastArtikelPosition;
    }
}
