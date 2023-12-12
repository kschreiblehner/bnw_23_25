package model;

/*
 * Fach 4: Buch1, Buch2, Buch3, Buch4
 * Fach 3: Buch5, Buch6, Buch7, Buch8
 * Fach 2: Buch9, Buch10, Buch11, Buch12
 * Fach 1: Buch13, Buch14, Buch15, Buch16
 * Fach 0: Buch17, Buch18, Buch19, Buch20
 *
 *                           fach position1
 * Zugriff auf Buch 10: bucher[2][1]
 *
 *
 * Zeile 0: 0 1 2 3
 * Zeile 1: 0 1 2 3
 * Zeile 2: 0 1 2 3
 *
 * Zugriff auf Zeile 1 Position 2: bucher[1][2]
 *
 * Zeile 0 hält ein Array der Länge 4
 * Zeile 1 hält ein Array der Länge 4
 * Zeile 2 hält ein Array der Länge 4
 *
 * Schreibe anstatt buecher1, fach1
 *
 * fach0 = new Buecher[4];
 * fach1 = new Buecher[4];
 * fach2 = new Buecher[4];
 *
 *
 * */
public class BuecherRegal {
    // erster Index ist das Fach
    // zweiter Index ist die Position im Fach
    private Buch[][] buecher;
    int anzahlFaecher;
    int anzahlBuecherProFach;

    public BuecherRegal(int anzahlFaecher, int anzahlBuecherProFach) {

        this.anzahlFaecher = anzahlFaecher;
        this.anzahlBuecherProFach = anzahlBuecherProFach;
        this.buecher = new Buch[anzahlFaecher][anzahlBuecherProFach];
    }

    public boolean insertBook(Buch buch, int fach, int position) {

        if (fach < 0 || fach >= anzahlFaecher) {
            System.err.println("Das Fach gibt es leider nicht.");
            return false;
        }
        if (position < 0  || position >= anzahlBuecherProFach) {
            System.err.println("Die Position gibt es leider nicht.");
            return false;
        }
        if (this.buecher[fach][position] == null) {
            this.buecher[fach][position] = buch;
            return true;
        } else {
            return false;
        }
    }

    public float berechneBuecherWert() {

        float summe = 0.f;
        // gehe durch alle Faecher
        for(int i = 0; i < this.anzahlFaecher; i++) {

            // gehe durch alle Positionen
            for(int j = 0; j < this.anzahlBuecherProFach; j++) {
                if (this.buecher[i][j] != null) {
                    /*              --vom Typ Buch  -- -- Preis    -- -- Wert in Klasse preis --       */
                    summe = summe + this.buecher[i][j].preiskategorie.preis;
                }
            }
        }
        return summe;
    }
}
