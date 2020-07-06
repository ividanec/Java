package edunova.soba;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Start {

	public Start() {
		izbornik();
	}
	
	public void izbornik() {
		
		System.out.println("*****************");
		System.out.println("1. Unos Sobe");
		System.out.println("2. Pregled soba");
		System.out.println("3. Promjena sobe");
		System.out.println("4. Brisanje sobe");
		System.out.println("t - IZLAZ");
		System.out.println("******************");
		odrediAkciju();
	}
	
	private void odrediAkciju() {
	
	
		switch(provjera()) {
		
		case "1":
			unosNoveSobe();
			break;
		case "2":
			pregledSoba();
			break;
		case "3":
			promjenaSobe();
			break;
		case "4":
			brisanjeSobe();
			break;
		case "t":
			System.out.println("Dovidenja");
			return;
			default:
				System.out.println("Ne postojeca akcija");
		}
		izbornik();
	}
	
		private String provjera() {
			String unos;
			while (true) {
				unos = JOptionPane.showInputDialog("Odaberi akciju");
				if (unos.length() > 1 || unos.trim().isEmpty() || (!unos.matches("[1-4]+") && !unos.equals("t"))) {
					JOptionPane.showMessageDialog(null, "Krivi odabir");
					continue;
				}
				return unos;

			}

		}
		
		
	

	private void unosNoveSobe() {
		// TODO Auto-generated method stub
		
	}

	private void pregledSoba() {
		// TODO Auto-generated method stub
		
	}

	private void promjenaSobe() {
		// TODO Auto-generated method stub
		
	}

	private void brisanjeSobe() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new Start();
	}
}
