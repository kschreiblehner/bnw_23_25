package model;

import java.util.Date;

public class Maerchenbuch extends Kinderbuch {

    private String ursprung;
    private Date[] zeitraum;

    public Maerchenbuch(String isbn, String titel, Author author, Preis preiskategorie,
                 int alterfreigabe, String material, String ursprung, Date[] zeitraum) {
        super(isbn, titel, author, preiskategorie, alterfreigabe, material);
        this.setUrsprung(ursprung);
        this.setZeitraum(zeitraum);
    }
    public Maerchenbuch(String isbn, String titel, Author author, Author coauthor, Preis preiskategorie,
                 int alterfreigabe, String material, String ursprung, Date[] zeitraum) {
        super(isbn, titel, author, coauthor, preiskategorie, alterfreigabe, material);
        this.setUrsprung(ursprung);
        this.setZeitraum(zeitraum);
    }

    public String getUrsprung() {
        return this.ursprung;
    }

    public void setUrsprung(String ursprung) {
        this.ursprung = ursprung;
    }

    public Date[] getZeitraum() {
        return this.zeitraum;
    }

    public void setZeitraum(Date[] zeitraum) {
        this.zeitraum = zeitraum;
    }
}
