package edunova.student;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Pomocno {
	
	// izbornik
	
	public static String izbornikAkcije(String poruka) {
		String s;
		while (true) {
			s = JOptionPane.showInputDialog(poruka);
			if(s.trim().isEmpty() || s.length() > 1 || (!s.matches("r") && !s.matches("[1-4]+"))) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
				continue;
			}
			return s;
		}
	}
	
	public static String ucitajString(String poruka) {
		String s;
		while (true) {
			s = JOptionPane.showInputDialog(poruka);
			if (s.trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Obavezan unos");
				continue;
			}
			return s;
		}
	}
	
	public static int ucitajBroj(String poruka) {
		while(true) {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(poruka));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
			}
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
	
	public static boolean prisutan(String poruka) {
		String s;
		
		while(true) {
			s= JOptionPane.showInputDialog(poruka);
			if(s.trim().toLowerCase().equals("da")) {
				return true;
			} else if (s.trim().toLowerCase().equals("ne")) {
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
	
	public static BigDecimal unosDecimala(String poruka) {
		while (true) {
			try {
				return new BigDecimal(JOptionPane.showInputDialog(poruka));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
			}
		}
	}
	
	// Random
	
	public static LocalDate createRandomDate(int sYear, int eYear) {
		int day = createRandomIntBetween(1, 28);
		int month = createRandomIntBetween(1, 12);
		int year = createRandomIntBetween(sYear, eYear);
		return LocalDate.of(year, month, day);
	}
	
	public static int createRandomIntBetween(int start, int end) {
		return start + (int) Math.round(Math.random() * (end - start));
	}
	
	public static String randomAdresa() {
		String[] s = new String[] { "Nova", "Velika", "Biogradska", "Republike", "Opps"};
		
		return s[randomNum(5, 1)];
	}
	
	public static int randomNum(int max, int min) {
		return (int) (Math.random() * (max - min) + min);
	}
	
	public static BigDecimal randomIznos() {
		return new BigDecimal((int) (Math.random() * ((10000-1000) +1)) + 1000);
	}
	
	public static BigDecimal randomKolicina() {
		return new BigDecimal((int) (Math.random() * ((10000-1000)+1)) + 1000);
	}
	
	public static String randomTwitter() {
		String[] s = new String[] { "@nenadB", "@zivkovic", "@milanr", "@ivida"};
		return s[randomNum(4, 1)];
	}
	
	public static String randomBoja() {
		String[] s = new String[] { "Crna", "Plava", "Zuta", "Zelena"};
		return s[randomNum(4, 1)];
	}
	
	public static String randomMreznoMjesto() {
		String[] s = new String[] { "Orebic", "Osijek", "Opatija", "Orahovica"};
		return s[randomNum(4, 1)];
	}
	
	public static String randomTelefon() {
		String[] s = new String[] { "0912323223", "0983423424", "095676789", "0912223434"};
		return s[randomNum(4, 1)];
	}
	
	public static boolean randomBoolean() {
		return (Math.random() >= 0.5) ? true : false;
	}
}
