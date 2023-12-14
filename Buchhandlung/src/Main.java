import model.*;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Anlegen eines Objektes vom Typ Author und Speichern in der Variable author1
        // Das ist das gleiche wie einen neuen Datensatz in SQL einfügen
/*        Author author1 = new Author();
        author1.authorId = 1;
        author1.nachname = "Gellert";
        author1.vorname = "W.";*/
        Author author1 = new Author(1, "Gellert", "W.");

        System.out.println(author1.getAuthorId());
        System.out.println(author1.getNachname());
        System.out.println(author1.getVorname());


        // Author author2 = new Author(); // umschreiben
        Author author2;  // Erstelle Variable vom Typ Author mit dem Name author2
        author2 = new Author(2, "Kuestner", "Dr. H.");  // Erstelle ein Objekt vom Typ Author und schreibe es in die Variable author2

        System.out.println(author2.getAuthorId());
        System.out.println(author2.getNachname());
        System.out.println(author2.getVorname());

        Preis preiskategorie1 = new Preis(1, 129.99f);  // this = 6ab5c3
/*      Preis preiskategorie1 = new Preis();
        preiskategorie1.preiskategorie = 1;
        preiskategorie1.preis = 129.99f;*/

        System.out.println(preiskategorie1.getPreiskategorie());
        System.out.println(preiskategorie1.getPreis());

        Preis preiskategorie2 = new Preis(2, 89.99f);  // this = 1a2b3c
        /*
        Preis preiskategorie2 = new Preis();
        preiskategorie2.preiskategorie = 2;
        preiskategorie2.preis = 89.99f;*/

        System.out.println(preiskategorie2.getPreiskategorie());
        System.out.println(preiskategorie2.getPreis());

        Preis preiskategorie3 = new Preis(3, 59.99f);  // this = abc123

        /*Preis preiskategorie3 = new Preis();
        preiskategorie3.preiskategorie = 3;
        preiskategorie3.preis = 59.99f;*/

        System.out.println(preiskategorie3.getPreiskategorie());
        System.out.println(preiskategorie3.getPreis());

        Buch buch1 = new Buch("111-11-1111111-1",
                "Die kleine Enzyklopaedie der Mathematik",
                author1,
                preiskategorie1);
/*        Buch buch1 = new Buch();
        buch1.isbn = "111-11-1111111-1";
        buch1.titel = "Die kleine Enzyklopaedie der Mathematik";
        buch1.author = author1;
        buch1.coauthor = author2;
        buch1.preiskategorie = preiskategorie1;*/

        Buch buch2 = new Buch("222-22-2222222-2",
                "Die grosse Enzyklopaedie der Mathematik",
                author1,
                author2,
                preiskategorie2);

        Buch comic1 = new Comic("333-33-333333-3",
                "Weihnachten mit Minnie und Mickey",
                author1,
                author2,
                preiskategorie1,
                0,
                "Klopapier",
                "Disney");

        Fachbuch fachbuch = new Fachbuch("333-33-333333-3",
                "Weihnachten mit Minnie und Mickey",
                author1,
                author2,
                preiskategorie1,
                "Programmierung",
                "Java",
                "8",
                new HashMap<>());

        fachbuch.addToGlossar("int", "int ist ein primitiver Datentyp für ganzzahlige Werte.");
        fachbuch.addToGlossar("double", "double ist ein primitver Datentyp für Flieskommazahlen nach IEEE 754.");

        BuecherRegal regal1 = new BuecherRegal(5, 10);
        boolean buch1infach3position2 = regal1.insertBook(buch1, 3, 2);
        System.out.println(buch1infach3position2);
        System.out.println(regal1.insertBook(buch2, 1, 0));
        System.out.println(regal1.insertBook(buch1, 5, 11));
        System.out.println(regal1.insertBook(buch1, 4, 11));
        System.out.println(regal1.insertBook(comic1, 0, 4));
        System.out.println(regal1.insertBook(fachbuch, 0, 2));

        System.out.println(regal1.berechneBuecherWert());

        System.out.println(regal1);
    }
}