package model;

public class Preis {
    public int preiskategorie;
    public float preis;  // IEEE 754 single precision

    public Preis() {}

    public Preis(int preiskategorie, float preis) {
        this.preiskategorie = preiskategorie;
        this.preis = preis;
    }
}
