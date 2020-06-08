package edunova;

import javax.swing.JOptionPane;

public class Zadatak02 {
	
	// Korisnik unosi broj od 1-5
	// Ako je unesen broj veći od 5 ili manji od 1
	// program ispisuje nije dobar broj
	// u slučaju dobrog unosa za brojčanu ocjenu
	// program ispisuje opisnu ocjenu :nedovoljan, dovoljan...
	//proba za git
		
		public static void main(String[] args) {
				int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj od 1 do 5"));
				
				if (broj <1 || broj > 5) {
					System.out.println("Nije dobar broj");
				}else {
					
				switch (broj) {
				case 1:
					System.out.println("Nedovoljan");
					break;
				case 2:
					System.out.println("Dovoljan");
					break;
				case 3:
					System.out.println("Dobar");
					break;
				case 4:
					System.out.println("Vrlo dobar");
					break;
				case 5:
					System.out.println("Odlican");
					break;
					}
				}
		}
	}
