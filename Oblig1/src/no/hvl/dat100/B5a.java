package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class B5a {

	public static void main(String[] args) {
		
		
	
	 String karakter = null;
				 
		 
		for (int i=1; i<=10; i++) {
		
		int poeng = parseInt(showInputDialog("Poengscore: "));
		if (poeng <= 100 && poeng >=0 ) {
			if (poeng <= 100 && poeng >=90 ) {
				karakter = "A";
			}
			if (poeng <= 89 && poeng >= 80) {
				karakter = "B";
			}
			if (poeng <= 79 && poeng >= 60) {
				karakter = "C";
			}
			if (poeng <= 59 && poeng >= 50) {
				karakter = "D";
			}
			if (poeng <= 49 && poeng >= 40) {
				karakter = "E";
			} 
			if (poeng <= 39 && poeng >=0) {
				karakter = "F";
			}
			System.out.println("Med poengsummen " + poeng + " har du fått karakteren " + karakter);
		}
		if (poeng > 100 || poeng < 0 ) {
		System.out.println("Ikke en gyldig poengsum ");
		i -=1;
		
		}
		
		}
	}
}
		


	
