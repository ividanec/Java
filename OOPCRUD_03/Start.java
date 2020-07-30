package edunova.zgrada;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class Start {

	private int zgradaId = 1;
	private int stranicaId = 1;
	
	private List<Zgrada> zgrade = new ArrayList<Zgrada>();
	
	public Start() {
		randomGenerator();
		
		while (true) {
			
			izbornik();
			
		switch (izbor()) {
		
		case "1":
			unosZgrade();
			break;
		case "2":
			ispisZgrada();
			break;
		case "3":
			promjenaZgrade();
			break;
		case "4":
			brisanjeZgrade();
			break;
		case "s":
			System.out.println("Dovidenja");
			return;
		default:
			System.out.println("Ne postojeća akcija");	
		}
	
		}
		
	}
	
	
	
	
	private void randomGenerator() {
		do {
			zgrade.add(randomUnosZgrade());
		} while (zgrade.size()<20);
		for(Zgrada zgrada : zgrade) {
			System.out.println(zgrada);
		}
	}




	private Zgrada randomUnosZgrade() {
		Zgrada zgrada = new Zgrada();
		
		zgrada.setSifra(zgradaId++);
		zgrada.setOpseg(Pomocno.randomOpseg());
		zgrada.setOpis(Pomocno.randomOpis());
		zgrada.setDopusten(Pomocno.randomBoolean());
		zgrada.setPrisutan(Pomocno.randomBoolean());
		zgrada.setDatum(Pomocno.createRandomDate(1900, 2000));
		zgrada.setStranica(randomUnosSmjer());
		
		return zgrada;
	}




	private Stranica randomUnosSmjer() {
		Stranica stranica = new Stranica();
		
		stranica.setSifra(stranicaId++);
		stranica.setIme(Pomocno.randomIme());
		stranica.setTwitter(Pomocno.randomTwitter());
		stranica.setPostanskiBroj(Pomocno.randomPostanskiBroj());
		stranica.setZabranjen(Pomocno.randomBoolean());
		stranica.setProdan(Pomocno.createRandomDate(1900, 2000));
		
		return stranica;
	}




	private void brisanjeZgrade() {
		System.out.println("***** BRISANJE ZGRADE *****");
		ispisZgrada();
		
		int sifra = Pomocno.ucitajBroj("Unesite sifru zgrade koju zelite obrisati");
		
		try {
		for(Zgrada zgrada : zgrade) {
			if(zgrada.getSifra().equals(sifra) && Pomocno.provjera("Jeste li sigurni da zelite obrisati zgradu" + "\n" + "  da/ne")) {
				zgrade.remove(sifra - 1);
				System.out.println("Zgrada obrisana!");
				return;
			}
		}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Zgrada pod tom sifrom ne postoji");
		}
	}




	private void promjenaZgrade() {
		while(true) {
			int sifra = Pomocno.ucitajBroj("Unesite sifru zgrade koju zelite promijeniti");
			
			try {
				for(Zgrada zgrada : zgrade) {
					if(zgrada.getSifra().equals(sifra)) {
						promjenaPodatakaZgrade(zgrada);
						return;
					}
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Zgrada pod tom sifrom ne postoji");
			}
		}
		
	}




	private void promjenaPodatakaZgrade(Zgrada zgrada) {
		
		zgrada.setSifra(zgradaId++);
		zgrada.setOpseg(Pomocno.unosDecimala("Unesite opseg"));
		zgrada.setOpis(Pomocno.ucitajString("Unesite opis"));
		zgrada.setDopusten(Pomocno.provjera("Dopusten da/ne?"));
		zgrada.setPrisutan(Pomocno.provjera("Prisutan da/ne?"));
		zgrada.setDatum(Pomocno.ucitajDatum("Unesite datum: (dd-MM-yyyy)"));
		zgrada.setStranica(unosNoveStranice());
		
		System.out.println("Zgrada uspjesno dodana");
	}




	private void ispisZgrada() {
		System.out.println("#### Ispis Zgrada ####");
		
		for(Zgrada zgrada : zgrade) {
			System.out.println(zgrada);
		}
	}




	private void unosZgrade() {
		Zgrada zgrada = new Zgrada();
		
		zgrada.setSifra(zgradaId++);
		zgrada.setOpseg(Pomocno.unosDecimala("Unesite opseg"));
		zgrada.setOpis(Pomocno.ucitajString("Unesite opis"));
		zgrada.setDopusten(Pomocno.provjera("Dopusten da/ne?"));
		zgrada.setPrisutan(Pomocno.provjera("Prisutan da/ne?"));
		zgrada.setDatum(Pomocno.ucitajDatum("Unesite datum: (dd-MM-yyyy)"));
		zgrada.setStranica(unosNoveStranice());
		
		zgrade.add(zgrada);
		System.out.println("Zgrada uspjesno dodana!");
	}




	private Stranica unosNoveStranice() {
		Stranica stranica = new Stranica();
		
		stranica.setSifra(stranicaId++);
		stranica.setIme(Pomocno.ucitajString("Unesite ime"));
		stranica.setTwitter(Pomocno.ucitajString("Unesite twitter"));
		stranica.setPostanskiBroj(Pomocno.unesiSamoBrojeve("Unesite postanski broj"));
		stranica.setZabranjen(Pomocno.provjera("Zabranjen da/ne?"));
		stranica.setProdan(Pomocno.ucitajDatum("Unesite datum: (dd-MM-yyyy)"));
		
		return stranica;
	}




	private String izbor() {
		
		return Pomocno.izbornikAkcije("Odaberite zeljenu akciju");
	}


	private void izbornik() {
		System.out.println("1. Unesi zgradu");
		System.out.println("2. Ispis zgrada");
		System.out.println("3. Promjeni zgradu");
		System.out.println("4. Brisanje zgrade");
		System.out.println("s - IZLAZ");
	}


	public static void main(String[] args) {
		new Start();
	}
}
