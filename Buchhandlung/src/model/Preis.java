package model;

public class Preis {
    private int preiskategorie;
    private float preis;  // IEEE 754 single precision

    private Preis() {}

    public Preis(int preiskategorie, float preis) {
        this.setPreiskategorie(preiskategorie);
        this.setPreis(preis);
    }

    public int getPreiskategorie() {
        return preiskategorie;
    }

    public void setPreiskategorie(int preiskategorie) {
        this.preiskategorie = preiskategorie;
    }

    public float getPreis() {
        return preis;
    }

    public void setPreis(float preis) {
        if (preis >= 0.f) {
            this.preis = preis;
        } else {
            System.err.println("Preis muss groesser als 0 sein.");
        }
    }
}
