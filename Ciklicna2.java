package edunova;

import javax.swing.JOptionPane;

public class Ciklicna2 {

	public static void main(String[] args) {
		
		int broj1 = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova:"));
		int broj2 = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca:"));
		
		int matrica[][] = new int [broj1][broj2];
		
		int prviStupac = 0;
		int prviRed = 0;
		int zadnjiRed = broj1 -1;
		int zadnjiStupac = broj2 -1;
		
		int tablica = 1;
		
		while(tablica <= broj1 * broj2) {
			
			
			//prvi red 
			for(int i=prviStupac; i<=zadnjiStupac; i++) {
				matrica[prviRed][i] = tablica++;
				if(tablica > broj1 * broj2) {
					break;
				}
			}
			// zadnji stupac 
			for(int j=prviRed + 1; j<=zadnjiRed; j++) {
				matrica[j][zadnjiStupac] = tablica++;
				if(tablica > broj1 * broj2) {
					break;
				}
			}
			// zadnji red 
			for(int i=zadnjiStupac -1; i>=prviStupac; i--) {
				matrica[zadnjiRed][i] = tablica++;
				if(tablica > broj1 * broj2) {
					break;
				}
			}
			// prvi stupac 
			for(int j=zadnjiRed -1; j>prviRed; j--) {
				matrica[j][prviStupac] = tablica++;
				if(tablica > broj1 * broj2) {
					break;
				}
			}
			
			
			prviStupac++;
			zadnjiStupac--;
			prviRed++;
			zadnjiRed--;
		}
		
		//ispis
		for(int i=0;i<broj1;i++) {
			for(int j=0;j<broj2;j++) {
				System.out.print(matrica[i][j] + "\t");
			}
				System.out.println();
		}
	}
}
