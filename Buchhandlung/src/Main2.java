import model.Author;
import model.Kinderbuch;
import model.Preis;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {

        List<String> meineListe = new ArrayList<>();
        meineListe.add("item1");
        meineListe.add("item2");
        meineListe.add("item1");
        System.out.println(meineListe);
        System.out.println(meineListe.get(1));
        System.out.println(meineListe.size());

        Set<String> meinSet = new HashSet<>();
        meinSet.add("item1");
        meinSet.add("item2");
        meinSet.add("item1");
        System.out.println(meinSet);
        for(String item : meinSet) {
            System.out.println(item);
        }
        meinSet.contains("item1");
        System.out.println(meinSet.size());

        Map<String, Integer> meineMap = new HashMap<>();
        meineMap.put("eins", 1);
        meineMap.put("zwei", 2);
        meineMap.put("drei", 3);

        System.out.println(meineMap.get("eins"));
        System.out.println(meineMap.get("zwei"));
        meineMap.size();

        Map<String, String> glossar = new HashMap<>();
        glossar.put("int", "int ist ein primitiver Datentyp für ganzzahlige Werte.");
        glossar.put("double", "double ist ein primitver Datentyp für Flieskommazahlen nach IEEE 754.");
        glossar.put("String", "String ist eine Klasse, die Zeichenketten speichern kann.");

        System.out.println(glossar.get("int"));
        System.out.println(glossar.get("String"));

        System.out.println();
    }

}
