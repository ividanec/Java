package vidanec.ljetnizadatak;

import java.awt.Desktop;
import java.net.URL;
import java.util.List;

import javax.swing.JOptionPane;


public class Start {

	public Start() {
		izbornik();
		Baza.zatvoriVezu();
	}
	
	private void izbornik() {
		System.out.println("***************************");
		System.out.println("1. Izlistaj sve osobe iz baze");
		System.out.println("2. Unesi novu osobu");
		System.out.println("3. Promjeni osobu");
		System.out.println("4. Obrisi osobu");
		System.out.println("5. ERA dijagram");
		System.out.println("6. Github kod");
		System.out.println("7. Izlaz iz aplikacije");
		System.out.println("***************************");
		izvedi();
	}

	private void izvedi() {
		switch (Pomocno.ucitajBroj("Odaberi zeljenu akciju")) {
		case 1:
			izlistajOsobe();
			izbornik();
			break;
		case 2:
			unosNoveOsobe();
			izbornik();
			break;
		case 3:
			promjeniOsobu();
			izbornik();
			break;
		case 4:
			obrisiOsobu();
			izbornik();
			break;
		case 5:
			eraDijagram();
			izbornik();
			break;
		case 6:
			linkGit();
			izbornik();
			break;
		default:
			break;
		}
		
	}

	private void linkGit() {
		try {
		    Desktop.getDesktop().browse(new URL("https://github.com/ividanec/Java/tree/master/ljetnizadatak").toURI());
		} catch (Exception e) {
			
		}
		
		
	}

	private void eraDijagram() {
		
		try {
		    Desktop.getDesktop().browse(new URL("https://github.com/ividanec/hellojp22/blob/master/era.jpg").toURI());
		} catch (Exception e) {
			
		}
	}

	private void obrisiOsobu() {
		Osoba osoba = odaberiOsobu("Unesite redni broj osobe koju zelite obrisati");
		if(osoba==null) {
			JOptionPane.showMessageDialog(null, "Krivi redni broj");
			return;
		}
		if(Pomocno.provjera("Jeste li sigurni da zelite obrisati osobu" + "\n" + "  da/ne")) {
		CRUDOsoba.deleteOsoba(osoba.getSifra());
		System.out.println("Osoba obrisana!"+ "\n"+"*******************");
		}
	}

	private void promjeniOsobu() {
		Osoba osoba = odaberiOsobu("Unesite redni broj osobe koju zelite promijeniti");
		if(osoba==null) {
			JOptionPane.showMessageDialog(null, "Krivi redni broj");
			return;
		}
		osoba.setIme(Pomocno.unosSamoSlova("Promjeni ime", osoba.getIme()));
		osoba.setPrezime(Pomocno.unosSamoSlova("Promjeni prezime", osoba.getPrezime()));
		osoba.setBroj_tel(Pomocno.unesiSamoBrojeve("Promjeni broj telefona", osoba.getBroj_tel()));
		osoba.setOib(Pomocno.unosOib("Promjeni oib", osoba.getOib()));
		
		CRUDOsoba.updateOsoba(osoba);
		
	}

	private void unosNoveOsobe() {
		CRUDOsoba.create(new Osoba(1,
				Pomocno.unosSamoSlova("Unesi ime osobe"),
				Pomocno.unosSamoSlova("Unesi prezime osobe"),
				Pomocno.unesiSamoBrojeve("Unesi broj telefona osobe"),
				Pomocno.unosOib("Unesi oib osobe")));
			
	}
	
	private Osoba odaberiOsobu(String poruka) {
		izlistajOsobe();
		int redniBroj= Pomocno.ucitajBroj(poruka);
		return CRUDOsoba.getOsoba(redniBroj);
	}

	private void izlistajOsobe() {
		System.out.println("***** Ispis Osoba *****");
		List<Osoba> osobe = CRUDOsoba.read();
		int redniBroj=1;
		
		for(int i=0;i<osobe.size();i++) {
			System.out.println(redniBroj++ + ". " + osobe.get(i));
			
		}
		System.out.println("*******************");
	}

	public static void main(String[] args) {
		new Start();
	}
}
