package model;

public class Artikel {

    private float preis;
    private String name;

    public Artikel(float preis, String name) {
//        this.preis = preis;
        this.setPreis(preis);
        this.name = name;
    }

    public void setPreis(float preis) {
        if (preis > 0.f) {
            this.preis = preis;
        } else {
            System.err.println("Der Preis muss groesser 0 sein.");
        }
    }

    public float getPreis() {
        return this.preis;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.getName() + ": " + this.getPreis();
    }
}
