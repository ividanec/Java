package edunova.soba;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Pomocno {
	
	
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
	
	
	public static boolean provjeraB(String poruka) {

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
	
	public static Date datum() {
		
		SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
		Date datum = new Date();
		datum = date.get2DigitYearStart();
		return datum;
	}
	
	
	
}
