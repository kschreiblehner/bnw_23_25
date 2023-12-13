package model;

public class Author {
    private int authorId;
    private String nachname;
    private String vorname;

    public Author(int authorId, String nachname, String vorname) {
        this.setAuthorId(authorId);
        this.setNachname(nachname);
        this.setVorname(vorname);
    }

    public int getAuthorId() {
        return this.authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getNachname() {
        return this.nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return this.vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
}
