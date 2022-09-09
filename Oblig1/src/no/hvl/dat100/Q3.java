package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Q3 {
	 
	public static void main(String[] args) {
		int helTall = parseInt(showInputDialog("Skriv inn et tall større enn 0: "));
		
		int fakultet = 1;
		int b = helTall; 
		System.out.print(helTall+"! = " + helTall);
		for (int i=1; i<=helTall; i++) {
			fakultet = fakultet * i;
			if (i<=helTall -1) {
				b -=1;
				System.out.print(" * " + b);
			}
			
			
			
			
		}
		System.out.print( " = "+fakultet);

		
	} 

}
