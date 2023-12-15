package model;

public class Artikel {

    private int artikelnummer;
    private float preis;
    private float ust;

    private String name;

    public Artikel(int artikelnummer, float preis, String name, float ust) {
//        this.preis = preis;
        this.setArtikelnummer(artikelnummer);
        this.setPreis(preis);
        this.setName(name);
        this.setUst(ust);
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

    public float getUst() {
        return ust;
    }

    public void setUst(float ust) {
        this.ust = ust;
    }
    public String getName() {
        return this.name;
    }

    public int getArtikelnummer() {
        return artikelnummer;
    }

    public void setArtikelnummer(int artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof Artikel)) {
            return false;
        }
        if(this.getArtikelnummer() == ((Artikel)obj).getArtikelnummer()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.getName() + ": " + this.getPreis() + " Ust.-satz: " + this.getUst();
    }
}
