package vidanec.ljetnizadatak;

import javax.swing.JOptionPane;

public class Pomocno {

	public static int ucitajBroj(String poruka) {
		while(true) {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(poruka));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
			}
		}
	}
	
	public static String ucitajString(String poruka) {
		String s;
		while(true) {
			s=JOptionPane.showInputDialog(poruka);
			if(s.trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Obavezan unos");
				continue;
			}
			return s;
		}
	}
	
	public static String ucitajString(String poruka, String trenutno) {
		String s;
		while(true) {
			s=JOptionPane.showInputDialog(poruka, trenutno);
			if(s.trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Obavezan unos");
				continue;		
			}
			return s;
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
	
	public static String unesiSamoBrojeve(String poruka, String trenutno) {
		String s;
		while(true) {
			s = JOptionPane.showInputDialog(poruka, trenutno);
			if (s.trim().isEmpty() || !s.matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
				continue;
			}
			return s;
		}
	}
	
	public static String unosSamoSlova(String poruka) {
		String s;
		while(true) {
			s = JOptionPane.showInputDialog(poruka);
			if (s.trim().isEmpty() || !s.matches("[a-zA-Z]+")) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
				continue;
			}
			return s;
		}
	}
	
	public static String unosSamoSlova(String poruka, String trenutno) {
		String s;
		while(true) {
			s = JOptionPane.showInputDialog(poruka, trenutno);
			if (s.trim().isEmpty() || !s.matches("[a-zA-Z]+")) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
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
	
	public static String unosOib(String poruka) {
		String s;
		while(true) {
			s = JOptionPane.showInputDialog(poruka);
			if(s.trim().isEmpty() || !s.matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
				
				} else if(s.length() !=11) {
					JOptionPane.showMessageDialog(null, "Mora sadrzavati 11 brojeva!");
				continue;
			}
			return s;
		}
	}
	
	public static String unosOib(String poruka, String trenutno) {
		String s;
		while(true) {
			s = JOptionPane.showInputDialog(poruka, trenutno);
			if(s.trim().isEmpty() || !s.matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
				
				} else if(s.length() !=11) {
					JOptionPane.showMessageDialog(null, "Mora sadrzavati 11 brojeva!");
				continue;
			}
			return s;
		}
	}
}
