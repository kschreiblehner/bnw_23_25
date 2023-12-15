package model;

public class Anschrift {
    private String strasse;
    private String hausnummer;
    private String plz;
    private String ort;

    public Anschrift(String strasse, String hausnummer, String plz, String ort) {
        this.setStrasse(strasse);
        this.setHausnummer(hausnummer);
        this.setPlz(plz);
        this.setOrt(ort);
    }

    public String getStrasse() {
        return this.strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausnummer() {
        return this.hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getPlz() {
        return this.plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return this.ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String toString() {
        return "Strasse: " + this.getStrasse() + "\n"
                + "Hausnummer: " + this.getHausnummer() + "\n"
                + "Postleitzahl: " + this.getPlz() + "\n"
                + "Ort: " + this.getOrt();
    }
}
