package model;

import java.time.LocalDate;

public class Privatkunde extends Kunde {

    private String nachname;
    private String vorname;

    public Privatkunde(int kundennummer, LocalDate kundeSeit, Anschrift anschrift, String nachname, String vorname) {
        super(kundennummer, kundeSeit, anschrift);
        this.nachname = nachname;
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String toString() {
        return super.toString()
                + "Nachname: " + this.getNachname() + "\n"
                + "Vorname: " + this.getVorname();
    }
}
