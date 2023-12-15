package model;

import java.time.LocalDate;

public class Grosskunde extends Kunde {

    private int ansprechPartnerID;
    private float rabatt;
    private String firmenname;

    public Grosskunde(int kundennummer, LocalDate kundeSeit, Anschrift anschrift, int ansprechPartnerID, float rabatt, String firmenname) {
        super(kundennummer, kundeSeit,anschrift);
        this.setAnsprechPartnerID(ansprechPartnerID);
        this.setRabatt(rabatt);
        this.setFirmenname(firmenname);
    }

    public int getAnsprechPartnerID() {
        return ansprechPartnerID;
    }

    public void setAnsprechPartnerID(int ansprechPartnerID) {
        this.ansprechPartnerID = ansprechPartnerID;
    }

    public float getRabatt() {
        return rabatt;
    }

    public void setRabatt(float rabatt) {
        this.rabatt = rabatt;
    }

    public String getFirmenname() {
        return firmenname;
    }

    public void setFirmenname(String firmenname) {
        this.firmenname = firmenname;
    }

    public String toString() {
        return super.toString() + "\n"
                + "Firmenname: " + this.getFirmenname() + "\n"
                + "Firmenrabatt: " + this.getRabatt() + "\n"
                + "Ansprechpartner-ID: " + this.getAnsprechPartnerID();
    }
}
