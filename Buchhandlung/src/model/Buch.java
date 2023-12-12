package model;

public class Buch {
    public String isbn;
    public String titel;
    public Author author;  // SQL: REFERENCES author(authorid)
    public Author coauthor;  // SQL: REFERENCES author(authorid)
    public Preis preiskategorie;  // SQL: REFERENCES preis(preiskategorie)

    public Buch(String isbn, String titel, Author author, Preis preiskategorie) {
        this.isbn = isbn;
        this.titel = titel;
        this.author = author;
        this.coauthor = null;
        this.preiskategorie = preiskategorie;
    }

    public Buch(String isbn, String titel, Author author, Author coauthor, Preis preiskategorie) {
        this.isbn = isbn;
        this.titel = titel;
        this.author = author;
        this.coauthor = coauthor;
        this.preiskategorie = preiskategorie;
    }
}
