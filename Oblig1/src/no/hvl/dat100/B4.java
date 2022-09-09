package no.hvl.dat100;

import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;

public class B4 {

	public static void main(String[] args) {
		
		String bruttolønnTxt = showInputDialog("Hva er din bruttolønn: " );
		int bruttolønn = parseInt(bruttolønnTxt);
		double skattesats1 = 0.0;
		double skattesats2 = 0.093;
		double skattesats3 = 0.241;
		double skattesats4 = 0.1152;
		double skattesats5 = 0.1452;
		
		double trinnskatt = 0;
		
		 if (bruttolønn <= 164100) {
			  trinnskatt = bruttolønn * skattesats1;
		 } else {
				if (bruttolønn >= 164101 && bruttolønn <= 230950) {
					 trinnskatt = bruttolønn - (bruttolønn * skattesats2);
				} else {
						if (bruttolønn >= 230950 && bruttolønn <= 580650) {
							  trinnskatt = bruttolønn - (bruttolønn * skattesats3);
						} else {
								if(bruttolønn >= 580651 && bruttolønn <= 934050) {
									trinnskatt = bruttolønn - (bruttolønn * skattesats4);
								} else {
									if (bruttolønn >= 934051) {
										 trinnskatt = bruttolønn - (bruttolønn * skattesats5);
										
									
								}
							}
						}
					}
					
				}
		 	showMessageDialog(null, " Ved en bruttolønn på " + bruttolønn + "kr " + "blir din trinnskatt " + trinnskatt + "kr ");
		 	
			
			}
		
		

	}


