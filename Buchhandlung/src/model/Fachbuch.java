package model;

import java.util.List;

public class Fachbuch extends Buch {
    private String fachrichtung;
    private String thema;
    private String auflage;
    private List<String> glossar;

    public Fachbuch(String isbn, String titel, Author author, Preis preiskategorie,
                    String fachrichtung, String thema, String auflage, List<String> glossar) {
        super(isbn,titel,author,preiskategorie);
        this.setFachrichtung(fachrichtung);
        this.setThema(thema);
        this.setAuflage(auflage);
        this.setGlossar(glossar);
    }

    public Fachbuch(String isbn, String titel, Author author, Author coauthor,
                    Preis preiskategorie, String fachrichtung, String thema,
                    String auflage, List<String> glossar) {
        super(isbn,titel,author, coauthor, preiskategorie);
        this.setFachrichtung(fachrichtung);
        this.setThema(thema);
        this.setAuflage(auflage);
        this.setGlossar(glossar);
    }

    public String getFachrichtung() {
        return this.fachrichtung;
    }

    public void setFachrichtung(String fachrichtung) {
        this.fachrichtung = fachrichtung;
    }

    public String getThema() {
        return this.thema;
    }

    public void setThema(String thema) {
        this.thema = thema;
    }

    public String getAuflage() {
        return this.auflage;
    }

    public void setAuflage(String auflage) {
        this.auflage = auflage;
    }

    public List<String> getGlossar() {
        return this.glossar;
    }

    public void setGlossar(List<String> glossar) {
        this.glossar = glossar;
    }

    public String toString() {
        return super.toString() + "\n" +
                "Fachrichtung: " + this.getFachrichtung() + "\n"
                + "Auflage: " + this.getAuflage() + "\n"
                + "Thema: " + this.getThema() + "\n"
                + "Glossar: " + this.getGlossar();
    }

}
