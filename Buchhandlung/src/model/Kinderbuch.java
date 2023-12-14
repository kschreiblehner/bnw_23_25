package model;

public class Kinderbuch extends Buch {
    protected int alterfreigabe;
    protected String material;

    public Kinderbuch(String isbn, String titel, Author author, Preis preiskategorie,
                      int alterfreigabe, String material) {
        super(isbn,titel,author,preiskategorie);
        this.setAlterfreigabe(alterfreigabe);
        this.setMaterial(material);
    }

    public Kinderbuch(String isbn, String titel, Author author, Author coauthor, Preis preiskategorie,
                      int alterfreigabe, String material) {
        super(isbn, titel, author, coauthor, preiskategorie);
        this.setAlterfreigabe(alterfreigabe);
        this.setMaterial(material);
    }

    public void vorlesenLassen() {}

    public int getAlterfreigabe() {
        return this.alterfreigabe;
    }

    public void setAlterfreigabe(int alterfreigabe) {
        this.alterfreigabe = alterfreigabe;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
