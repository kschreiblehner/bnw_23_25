import model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Artikel artikel1 = new Artikel(15.99f, "Artikel 1");
        Artikel artikel2 = new Artikel(25.99f, "Artikel 2");
        Artikel artikel3 = new Artikel(18.99f, "Artikel 3");
        Artikel artikel4 = new Artikel(7.99f, "Artikel 4");
        Artikel artikel5 = new Artikel(1.99f, "Artikel 5");

        artikel1.setPreis(-42.42f);
        System.out.println(artikel1.getPreis());


        Bestellung bestellung1 = new Bestellung(1);
        bestellung1.addArtikel(artikel1);
        bestellung1.addArtikel(artikel3);
        bestellung1.addArtikel(artikel5);

        System.out.println("Bestellung 1");
        System.out.println(bestellung1.berechneGesamtPreis());
        System.out.println(bestellung1.getGesamtPreis());
        System.out.println(bestellung1);

        Bestellung bestellung2 = new Bestellung(2);
        bestellung2.addArtikel(artikel1);
        bestellung2.addArtikel(artikel2);
        bestellung2.addArtikel(artikel3);
        bestellung2.addArtikel(artikel4);
        bestellung2.addArtikel(artikel5);
        System.out.println("Bestellung 2");
        System.out.println(bestellung2.berechneGesamtPreis());
        System.out.println(bestellung2.getGesamtPreis());

        Kunde kunde1 = new Kunde(1, LocalDate.of(2022,01,01), new Anschrift("weg", "1a", "00000", "Ort"));
        kunde1.addBestellung(bestellung1);
        kunde1.addBestellung(bestellung2);

        Kunde kunde2 = new Kunde(2, LocalDate.of(2022,01,02), new Anschrift("weg", "1a", "00000", "Ort"));
        kunde2.addBestellung(bestellung1);

        Kunde kunde3 = new Grosskunde(2, LocalDate.of(2022,01,02), new Anschrift("weg", "1a", "00000", "Ort"), 1, 0.05f, "firma abc GmbH");
        Kunde kunde4 = new Privatkunde(2, LocalDate.of(2022,01,02), new Anschrift("weg", "1a", "00000", "Ort"), "Schreiblehner", "Karsten");

        System.out.println("=====");
        System.out.println(kunde2);
        System.out.println("=====");
        System.out.println(kunde3);
        System.out.println("=====");
        System.out.println(kunde4);
    }
}