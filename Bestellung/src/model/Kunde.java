package model;

public class Kunde {
    private int kundennummer;
    private String nachname;
    private String vorname;
    private String kundeSeit;
    private Bestellung[] bestellungen;
    // index der zuletzt hinzugefuegten Bestellung
    private int bestellungsIndex;

    public Kunde(int kundennummer, String nachname, String vorname, String kundeSeit) {

        this.setKundennummer(kundennummer);
        this.setNachname(nachname);
        this.setVorname(vorname);
        this.setKundeSeit(kundeSeit);
        this.setBestellungen(new Bestellung[20]);
        this.setBestellungsIndex(-1);
    }

    public boolean addBestellung(Bestellung bestellung) {
        if (this.bestellungsIndex < bestellungen.length-1) {
            this.bestellungen[++this.bestellungsIndex] = bestellung;
            return true;
        }
        return false;
    }

    public int getKundennummer() {
        return this.kundennummer;
    }

    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }

    public String getNachname() {
        return this.nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return this.vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getKundeSeit() {
        return this.kundeSeit;
    }

    public void setKundeSeit(String kundeSeit) {
        this.kundeSeit = kundeSeit;
    }

    public Bestellung[] getBestellungen() {
        return this.bestellungen;
    }

    public void setBestellungen(Bestellung[] bestellungen) {
        // kunde darf maximal 20 Bestellungen haben
        if (bestellungen.length <= 20) {
            this.bestellungen = bestellungen;
        } else {
            System.err.println("Es können maximal 20 Bestellungen gespeichert werden.");
        }
    }

    public int getBestellungsIndex() {
        return this.bestellungsIndex;
    }

    public void setBestellungsIndex(int bestellungsIndex) {
        this.bestellungsIndex = bestellungsIndex;
    }
}
