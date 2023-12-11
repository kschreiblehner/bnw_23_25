package model;

public class Artikel {

    float preis;
    String name;

    public Artikel(float preis, String name) {
        this.preis = preis;
        this.name = name;
    }

    public float getPreis() {
        return preis;
    }

    public void setPreis(float preis) {
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
