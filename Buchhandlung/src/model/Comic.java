package model;

public class Comic extends Kinderbuch{

    private String stil;

    public Comic(String isbn, String titel, Author author, Preis preiskategorie,
                 int alterfreigabe, String material, String stil) {
        super(isbn, titel, author, preiskategorie, alterfreigabe, material);
        this.setStil(stil);
    }
    public Comic(String isbn, String titel, Author author, Author coauthor, Preis preiskategorie,
                 int alterfreigabe, String material, String stil) {
        super(isbn, titel, author, coauthor, preiskategorie, alterfreigabe, material);
        this.setStil(stil);
    }

    public String getStil() {
        return this.stil;
    }

    public void setStil(String stil) {
        this.stil = stil;
    }
}
