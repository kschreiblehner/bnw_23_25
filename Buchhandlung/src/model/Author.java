package model;

public class Author {
    public int authorId;
    public String nachname;
    public String vorname;

    public Author(int authorId, String nachname, String vorname) {
        this.authorId = authorId;
        this.nachname = nachname;
        this.vorname = vorname;
    }
}
