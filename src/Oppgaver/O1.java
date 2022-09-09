package Oppgaver;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {

	public static void main(String[] args) {

		double t1 = 0.0097;
		double t2 = 0.0241;
		double t3 = 0.1152;
		double t4 = 0.1452;

		String bruttolonnTxt = showInputDialog("Skriv inn bruttolønn: ");
		int bL = parseInt(bruttolonnTxt);

		if (bL <= 164100) {
			System.out.println("Sats: 0.00%");
			System.out.println("Trinnskatt: 0.0kr");
		} else if (bL > 164100 && bL <= 230950) {
			System.out.println("Sats: 0.97%");
			System.out.println("Trinnskatt: " + bL * t1 + "kr");
		} else if (bL > 230950 && bL <= 580650) {
			System.out.println("Sats: 2.41%");
			System.out.println("Trinnskatt: " + bL * t2 + "kr");
		} else if (bL > 580650 && bL <= 934050) {
			System.out.println("Sats: 11.52%");
			System.out.println("Trinnskatt: " + bL * t3 + "kr");
		} else {
			System.out.println("Sats: 14.52%");
			System.out.println("Trinnskatt: " + bL * t4 + "kr");
		}
	}
}
