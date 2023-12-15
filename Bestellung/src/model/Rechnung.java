package model;

import java.util.HashMap;
import java.util.Map;

public class Rechnung {

    private Bestellung bestellung;
    // key: Artikel; value: Anzahl der Artikel
    private Map<Artikel, Integer> positionen;
    private float gesamtpreisMitRabatt = 0.f;
    private float gesamtpreisMitUst = 0.f;
    // key: Ust.-satz; value: Summe der Umsatzsteuer fuer diesen Ust.-Satz
    private Map<Float, Double> ust = new HashMap<>();


    public Rechnung(Bestellung bestellung) {
        this.bestellung = bestellung;
        this.positionen = new HashMap<>();

        initRechnung();
    }

    private void initRechnung() {
        initPositionen();

        initUstProPosition();

        // gesamtpreis mit rabatt ohne ust
        for(Artikel a : this.positionen.keySet()) {
            this.gesamtpreisMitRabatt += a.getPreis()*this.positionen.get(a);
        }
        // mit ternären Operator
        this.gesamtpreisMitRabatt -= this.bestellung.getRabatt() > 0.f ?
                this.gesamtpreisMitRabatt*this.bestellung.getRabatt() :
                0;

        // aufsummieren der ust
        for(Float ustsatz : this.ust.keySet()) {
            this.gesamtpreisMitUst += this.ust.get(ustsatz);
        }
        this.gesamtpreisMitUst += this.gesamtpreisMitRabatt;
    }

    private void initUstProPosition() {
        for(Artikel a : this.positionen.keySet()) {
            double ustVorher = 0.;
            if (this.ust.containsKey(a.getUst())) {
                ustVorher = this.ust.get(a.getUst());
            }
            ustVorher += this.positionen.get(a)*a.getPreis()*a.getUst();
            this.ust.put(a.getUst(), ustVorher);
        }
    }

    private void initPositionen() {
        for(Artikel a : bestellung.getArtikel()) {
            int anzahl = 1;
            if(positionen.containsKey(a)) {
                anzahl = positionen.get(a) + 1;
            }
            this.positionen.put(a, anzahl);
        }
    }

    public String toString() {
        String s = "";
        for(Artikel a : this.positionen.keySet()) {
            s += a + " Anzahl: " + this.positionen.get(a) + " \n";
        }
        s += "Gesamtpreis (mit Rabatt " + this.bestellung.getRabatt() + ") : " + this.gesamtpreisMitRabatt + "\n";
        for (Float ustsatz : this.ust.keySet()) {
            s += "Ust.-Satz: " + ustsatz + " Summe " + this.ust.get(ustsatz) + "\n";
        }
        s += "Gesamtpreis (mit Ust.) " + this.gesamtpreisMitUst + "\n";
        return s;
    }
}
