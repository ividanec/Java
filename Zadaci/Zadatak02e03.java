package edunova;


import javax.swing.JOptionPane;

public class Zadatak2 {
	
	// Korisnik unosi 3 elementa niza koji su cijeli brojevi
	// program ispisuje zbroj sva tri elementa niza

	public static void main(String[] args) {
		int[] niz = new int[3];
		niz[0]= Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		niz[1]= Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		niz[2]= Integer.parseInt(JOptionPane.showInputDialog("Unesi treci broj"));
		
		
		
		System.out.println(niz[0]+niz[1]+niz[2]);
		
		
	}
}
