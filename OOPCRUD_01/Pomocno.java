package edunova.soba;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Pomocno {
	
	public static String izbornikAkcije(String poruka) {
		String s;
		while (true) {
			s = JOptionPane.showInputDialog("Odaberi akciju");
			if (s.length() > 1 || s.trim().isEmpty() || (!s.matches("[1-4]+") && !s.equals("t"))) {
				JOptionPane.showMessageDialog(null, "Krivi odabir");
				continue;
			}
			return s;

		}

	}
	
	
	public static int ucitajBroj(String poruka) {
		while(true) {
			try {
				return Integer.parseInt(
						JOptionPane.showInputDialog(poruka));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
			}
		}
	}
	
	public static String ucitajString(String poruka) {

		String s;
		while (true) {
			s = JOptionPane.showInputDialog(poruka);
			if (s.trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
				continue;
			}

			return s;

		}

	}
	
	
	public static boolean provjera(String poruka) {

		String s;

		while (true) {
			s = JOptionPane.showInputDialog(poruka);

			if (s.toLowerCase().equals("da")) {
				return true;
			} else if (s.toLowerCase().equals("ne")) {
				return false;
			} else {
				JOptionPane.showMessageDialog(null, "Krivi unos");
			}
		}

	}
	
	public static String unesiSamoBrojeve(String poruka) {
		String s;
		while(true) {
			s = JOptionPane.showInputDialog(poruka);
			if (s.trim().isEmpty() || !s.matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
				continue;
			}
			return s;
		}
	}
	
	public static LocalDate ucitajDatum(String poruka) {
		String datum;
		LocalDate date;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		while(true) {
			datum = JOptionPane.showInputDialog(poruka);
			
			try {
				return date = LocalDate.parse(datum, formatter);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
			}
		}
	}
	
	// random
	
	public static boolean randomBoolean() {
		return (Math.random() >= 0.5) ? true : false;
	}
	
	public static LocalDate createRandomDate(int sYear, int eYear) {
		int day = createRandomIntBetween(1, 28);
		int month = createRandomIntBetween(1, 12);
		int year = createRandomIntBetween(sYear, eYear);
		return LocalDate.of(year, month, day);
	}
	
	public static int createRandomIntBetween(int start, int end) {
		return start + (int) Math.round(Math.random() * (end - start));
	}
	
	public static String randomPostanskiBroj() {
		String[] s = new String[] { "31208", "10000", "23000", "40000"};
		return s[randomNum(4, 1)];
	}
	
	public static int randomNum(int max, int min) {
		return (int) (Math.random() * (max - min) + min);
	}
	
	public static String randomNaziv() {
		String[] s = new String[] { "Ivan", "Mrkva", "Plavo", "Krivo"};
		return s[randomNum(4, 1)];
	}
	
	public static String randomMobitel() {
		String[] s = new String[] { "0912323223", "0983423424", "095676789", "0912223434"};
		return s[randomNum(4, 1)];
	}
}
