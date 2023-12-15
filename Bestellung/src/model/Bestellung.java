package model;

import java.util.ArrayList;
import java.util.List;

public class Bestellung {
    private int bestellnummer;
    private float gesamtPreis;
    private float rabatt;
    private List<Artikel> artikel;

    public Bestellung(int bestellnummer) {
        this.bestellnummer = bestellnummer;
        // Gesamtpreis sollte initial gleich 0 sein.
        this.gesamtPreis = 0.f;
        // Rabatt gibt es nicht
        this.setRabatt(0.f);
        // Es sind maximal 50 Artikel erlaubt
        this.setArtikel(new ArrayList<Artikel>());
    }

    public float berechneGesamtPreis() {
        float summe = 0.f;

        for(Artikel a : this.getArtikel()) {
            summe += a.getPreis();
        }
        return summe;
    }

    public void addArtikel(Artikel artikel) {
        this.artikel.add(artikel);
        this.gesamtPreis += artikel.getPreis();
    }

    public int getBestellnummer() {
        return this.bestellnummer;
    }

    public void setBestellnummer(int bestellnummer) {
        this.bestellnummer = bestellnummer;
    }

    public float getGesamtPreis() {
        return this.gesamtPreis;
    }

    public void setGesamtPreis(float gesamtPreis) {
        this.gesamtPreis = gesamtPreis;
    }

    public float getRabatt() {
        return this.rabatt;
    }

    public void setRabatt(float rabatt) {
        if (rabatt >= 0.f && rabatt <= 1.0f) {
            this.rabatt = rabatt;
        } else {
            System.err.println("Rabatt muss im Intervall [0,1] sein.");
        }
    }

    public List<Artikel> getArtikel() {
        return this.artikel;
    }

    public void setArtikel(List<Artikel> artikel) {
        this.artikel = artikel;
    }

    public String toString() {
        String s = "";
        s += "Bestellnummer: " + this.getBestellnummer() + "\n";
        s += "Artikel:\n";
        for (Artikel a : this.getArtikel()) {
            s += "\t" + a + "\n";
        }
        s += "Rabatt: " + this.getRabatt() + "\n";
        s += "Gesamtpreis: " + this.getGesamtPreis() + "\n";
        return s;
    }
}
