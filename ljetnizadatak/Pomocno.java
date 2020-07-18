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
	
}
