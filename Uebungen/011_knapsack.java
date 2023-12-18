public class Main3 {


    public static void main(String[] args) {


/*
* (index 0) Geschenk A: Wert = 1, Gewicht = 5
* (index 1) Geschenk B: Wert = 2, Gewicht = 7
* (index 2) Geschenk C: Wert = 3, Gewicht = 10
* */
        int[] wert = {1, 2, 3};
        int[] gewicht = {100, 110, 60};

        int maximalgewicht = 200;

        int[][] tabelle = new int[maximalgewicht+1][wert.length+1];

        // initialisiere erste Spalte und Zeile
        // setze erste Zeile = 0
        for (int spalte = 0; spalte < tabelle[0].length; spalte++ ) {
            tabelle[0][spalte] = 0;
        }

        // setze die erste Spalte auf 0
        for (int zeile = 0; zeile < tabelle.length; zeile++) {
            tabelle[zeile][0] = 0;
        }

        // arbeite Spalte fuer Spalte ab.
        for(int spalte = 1; spalte < wert.length+1; spalte++) {
            for(int zeile = 1; zeile < maximalgewicht+1; zeile++) {
                // aktuelles element gewicht[spalte-1]

                if (gewicht[spalte-1] <= zeile) {
                    // uebriges gewicht des sackes ohne das aktuelle element
                    int w = zeile - gewicht[spalte-1];
                    int spaltenwert = wert[spalte-1] + tabelle[w][spalte];
                    tabelle[zeile][spalte] = Math.max(spaltenwert, tabelle[zeile][spalte-1]);
//                    if (spaltenwert >= tabelle[zeile][spalte-1]) {
//                        tabelle[zeile][spalte] = spaltenwert;
//                    } else {
//                        tabelle[zeile][spalte] = tabelle[zeile][spalte-1];
//                    }
                } else {
		            tabelle[zeile][spalte] = tabelle[zeile][spalte-1];
		        }
            }
        }

        for (int j = 0; j < maximalgewicht+1; j++) {
            System.out.print(j + "\t");
            for (int i = 0; i < wert.length + 1; i++) {
                System.out.print(tabelle[j][i] + "\t");
            }
            System.out.println();
        }
    }
}