import model.Artikel;
import model.Bestellung;
import model.Kunde;

public class Main {
    public static void main(String[] args) {

        Artikel artikel1 = new Artikel(15.99f, "Artikel 1");
        Artikel artikel2 = new Artikel(25.99f, "Artikel 2");
        Artikel artikel3 = new Artikel(18.99f, "Artikel 3");
        Artikel artikel4 = new Artikel(7.99f, "Artikel 4");
        Artikel artikel5 = new Artikel(1.99f, "Artikel 5");

        Bestellung bestellung1 = new Bestellung(1);
        bestellung1.addArtikel(artikel1);
        bestellung1.addArtikel(artikel3);
        bestellung1.addArtikel(artikel5);

        System.out.println("Bestellung 1");
        System.out.println(bestellung1.berechneGesamtPreis());
        System.out.println(bestellung1.getGesamtPreis());

        Bestellung bestellung2 = new Bestellung(2);
        bestellung2.addArtikel(artikel1);
        bestellung2.addArtikel(artikel2);
        bestellung2.addArtikel(artikel3);
        bestellung2.addArtikel(artikel4);
        bestellung2.addArtikel(artikel5);
        System.out.println("Bestellung 2");
        System.out.println(bestellung2.berechneGesamtPreis());
        System.out.println(bestellung2.getGesamtPreis());

        Kunde kunde1 = new Kunde(1, "Schreiblehner", "Karsten", "01.01.2022");
        kunde1.addBestellung(bestellung1);
        kunde1.addBestellung(bestellung2);

        Kunde kunde2 = new Kunde(2, "Korb", "Klaus", "02.01.2022");
        kunde2.addBestellung(bestellung1);
    }
}