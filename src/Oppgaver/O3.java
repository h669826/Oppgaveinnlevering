package Oppgaver;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {

	public static void main(String[] args) {

		String nTxt = showInputDialog("Positivt heltall");
		int n = parseInt(nTxt);
		int nFakultet = 1;
		if (n < 0) {
			showMessageDialog(null, "Vennligst tast inn et positivt heltall");
		} else {

			for (int i = 1; i <= n; i++) {
				nFakultet *= i;
			}
			System.out.println(n + "!" + " = " + nFakultet);
		}
	}
}
