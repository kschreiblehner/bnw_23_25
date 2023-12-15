package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Kunde {
    protected int kundennummer;
    protected LocalDate kundeSeit;
    protected List<Bestellung> bestellungen;
    protected Anschrift anschrift;

    public Kunde(int kundennummer, LocalDate kundeSeit, Anschrift anschrift) {

        this.setKundennummer(kundennummer);
        this.setKundeSeit(kundeSeit);
        this.setBestellungen(new ArrayList<Bestellung>());
        this.setAnschrift(anschrift);
    }

    public void addBestellung(Bestellung bestellung) {
        this.bestellungen.add(bestellung);
    }

    public int getKundennummer() {
        return this.kundennummer;
    }

    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }

    public LocalDate getKundeSeit() {
        return this.kundeSeit;
    }

    public void setKundeSeit(LocalDate kundeSeit) {
        this.kundeSeit = kundeSeit;
    }

    public List<Bestellung> getBestellungen() {
        return this.bestellungen;
    }

    public void setBestellungen(List<Bestellung> bestellungen) {
        this.bestellungen = bestellungen;
    }

    public Anschrift getAnschrift() {
        return this.anschrift;
    }

    public void setAnschrift(Anschrift anschrift) {
        this.anschrift = anschrift;
    }

    public String toString() {
        String s = "";
        s += "Kundennummer: " + this.getKundennummer() + "\n";
        s += "Kunde seit: " + this.getKundeSeit() + "\n";
        s += "Anschrift: \n" + this.getAnschrift() + "\n";
        s += "Bestellungen:\n";

        for (Bestellung b : this.getBestellungen()) {
            s += "\tBestellnummer: " + b.getBestellnummer() + "\n";
        }
        return s;
    }
}
