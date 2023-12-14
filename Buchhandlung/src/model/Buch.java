package model;

public class Buch {
    protected String isbn;
    protected String titel;
    protected Author author;  // SQL: REFERENCES author(authorid)
    protected Author coauthor;  // SQL: REFERENCES author(authorid)
    protected Preis preiskategorie;  // SQL: REFERENCES preis(preiskategorie)

    public Buch(String isbn, String titel, Author author, Preis preiskategorie) {
        this.setIsbn(isbn);
        this.setTitel(titel);
        this.setAuthor(author);
        this.setCoauthor(null);
        this.setPreiskategorie(preiskategorie);
    }

    public Buch(String isbn, String titel, Author author, Author coauthor, Preis preiskategorie) {
        this.setIsbn(isbn);
        this.setTitel(titel);
        this.setAuthor(author);
        this.setCoauthor(coauthor);
        this.setPreiskategorie(preiskategorie);
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitel() {
        return this.titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getCoauthor() {
        return this.coauthor;
    }

    public void setCoauthor(Author coauthor) {
        this.coauthor = coauthor;
    }

    public Preis getPreiskategorie() {
        return this.preiskategorie;
    }

    public void setPreiskategorie(Preis preiskategorie) {
        this.preiskategorie = preiskategorie;
    }
}
