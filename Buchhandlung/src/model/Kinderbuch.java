package model;

public class Kinderbuch extends Buch {
    protected int altersfreigabe;
    protected String material;

    public Kinderbuch(String isbn, String titel, Author author, Preis preiskategorie,
                      int alterfreigabe, String material) {
        super(isbn,titel,author,preiskategorie);
        this.setAltersfreigabe(alterfreigabe);
        this.setMaterial(material);
    }

    public Kinderbuch(String isbn, String titel, Author author, Author coauthor, Preis preiskategorie,
                      int altersfreigabe, String material) {
        super(isbn, titel, author, coauthor, preiskategorie);
        this.setAltersfreigabe(altersfreigabe);
        this.setMaterial(material);
    }

    public void vorlesenLassen() {}

    public int getAltersfreigabe() {
        return this.altersfreigabe;
    }

    public void setAltersfreigabe(int alterfreigabe) {
        this.altersfreigabe = altersfreigabe;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String toString() {
        return super.toString() + "\n" +
                "Altersfreigabe: " + this.getAltersfreigabe() + "\n" +
                "Material: " + this.getMaterial();
    }
}
