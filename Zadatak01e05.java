package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	//Korisnik unosi 2 broja
	// program ispisuje sumu, razliku, produkt i kvocijent
	// koristeći 4 metode

	
	public static void main(String[] args) {
		
		int broj1=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj: "));
		int broj2=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj: "));
		
		System.out.println(suma(broj1, broj2) + " je suma");
		System.out.println(razlika(broj1, broj2) + " je razlika");
		System.out.println(produkt(broj1, broj2) + " je produkt");
		System.out.println(kvocijent(broj1, broj2) + " je kvocijent");
	}
	
	static int suma(int broj1, int broj2) { 
	
		return broj1 + broj2;
	}
	
	static int razlika(int broj1, int broj2) {
		return broj1 - broj2;
	}
	
	static int produkt(int broj1, int broj2) {
		return broj1 * broj2;
	}
	
	static double kvocijent(int broj1, int broj2) {
		
		double x = broj1;
		double y = broj2;
		return x/y;
	}

}