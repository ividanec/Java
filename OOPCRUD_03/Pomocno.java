package edunova.zgrada;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Pomocno {

	public static String izbornikAkcije(String poruka) {
		String s;
		while (true) {
			s = JOptionPane.showInputDialog(poruka);
			if(s.trim().isEmpty() || s.length() > 1 || (!s.matches("s") && !s.matches("[1-4]+"))) {
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
	
	public static boolean provjera(String poruka) {
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
	
	public static int ucitajBroj(String poruka) {
		while(true) {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(poruka));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
			}
		}
	}
	
	// random
	
	public static BigDecimal randomOpseg() {
		return new BigDecimal((int) (Math.random() * ((10000-1000) +1)) + 1000);
	}
	
	public static String randomOpis() {
		String[] s = new String[] { "Veliko", "Osijek", "Malo", "Crno"};
		return s[randomNum(4, 1)];
	}
	
	public static int randomNum(int max, int min) {
		return (int) (Math.random() * (max - min) + min);
	}
	
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
	
	public static String randomIme() {
		String[] s = new String[] { "Ivan", "Mirko", "Nenad", "Zvonko"};
		return s[randomNum(4, 1)];
	}
	
	public static String randomTwitter() {
		String[] s = new String[] { "@nenadB", "@zivkovic", "@milanr", "@ivida"};
		return s[randomNum(4, 1)];
	}
	
	public static String randomPostanskiBroj() {
		String[] s = new String[] { "31208", "31000", "10000", "20000"};
		return s[randomNum(4, 1)];
	}
}
