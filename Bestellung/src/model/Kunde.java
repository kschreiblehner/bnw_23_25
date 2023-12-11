package model;

public class Kunde {
    protected int kundennummer;
    String nachname;
    String vorname;
    String kundeSeit;
    Bestellung[] bestellungen;
    // index der zuletzt hinzugefuegten Bestellung
    int bestellungsIndex;

    public Kunde(int kundennummer, String nachname, String vorname, String kundeSeit) {

        this.kundennummer = kundennummer;
        this.nachname = nachname;
        this.vorname = vorname;
        this.kundeSeit = kundeSeit;
        // kunde darf maximal 20 Bestellungen haben
        this.bestellungen = new Bestellung[20];
        this.bestellungsIndex = -1;
    }

    public boolean addBestellung(Bestellung bestellung) {
        if (this.bestellungsIndex < bestellungen.length-1) {
            this.bestellungen[++this.bestellungsIndex] = bestellung;
            return true;
        }
        return false;
    }

}
