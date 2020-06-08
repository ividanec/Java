package edunova;

import javax.swing.JOptionPane;

public class Zadatak01 {
	
	// Korisnik unosi 3 broj
	// ispisuje se najveći
	
	public static void main(String[] args) {
		int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		int treciBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi treci broj"));
		
		if(prviBroj >= drugiBroj && prviBroj >= treciBroj) {
			System.out.println(prviBroj);
		}else if (drugiBroj >= prviBroj && drugiBroj >= treciBroj) {
			System.out.println(drugiBroj);
		}else if (treciBroj >= prviBroj && treciBroj >= drugiBroj) {
			System.out.println(treciBroj);
		}
	
	}

}
