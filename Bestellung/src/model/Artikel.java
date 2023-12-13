package model;

public class Artikel {

    private float preis;
    private String name;

    public Artikel(float preis, String name) {
        this.preis = preis;
        this.name = name;
    }

    public void setPreis(float preis) {
        this.preis = preis;
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
}
