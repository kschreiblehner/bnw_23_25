import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class 006_dec_bin_umrechnung extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {int x_max = 9;
int y_max = 9;

public void main() {
	int zahl = liesZahl("Dezimalzahl: ");
	int zahlTmp = zahl;
	int len = 0;
	
	while(zahlTmp > 0)	{
		zahlTmp /= 2;
		len++;
	}
	
	int ergebnis[] = new int[len];
	
	for(int i = len-1; i >= 0; i--) {
		ergebnis[i] = restDiv2(zahl);
		// zahl /= 2;  // zahl = zahl / 2;
		zahl >>= 1;
	}
	
	// ausgabe array
	String s = "";
	for(int i = 0; i < ergebnis.length; i++) {
		s += ergebnis[i];
	}
	schreib("" + s);			

}

int restDiv2(int zahl) {
  return zahl-((zahl >> 1)<<1);
}}