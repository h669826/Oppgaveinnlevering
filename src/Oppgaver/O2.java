package Oppgaver;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {

	public static void main(String[] args) {

		String karakterUt;
		for (int i = 1; i < 10; i++) {
			String karakterTxt = showInputDialog("Skriv inn poengsum: ");
			int poeng = parseInt(karakterTxt);
			if (poeng >= 0 && poeng <= 100) {
				if (poeng >= 0 && poeng <= 39) {
					karakterUt = "F";
				} else if (poeng >= 40 && poeng <= 49) {
					karakterUt = "E";
				} else if (poeng >= 50 && poeng <= 59) {
					karakterUt = "D";
				} else if (poeng >= 60 && poeng <= 79) {
					karakterUt = "C";
				} else if (poeng >= 80 && poeng <= 89) {
					karakterUt = "B";
				} else {
					karakterUt = "A";
				}
				System.out.println("Din karakter er: " + karakterUt);
			} else {
				showMessageDialog(null, "Vennligst tast inn en gyldig poengsum mellom 0 og 100");
				karakterUt = "Ugyldig";
				i -= 1;
			}

		}
	}
}
