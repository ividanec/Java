package edunova.soba;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class Start {
	

	List<Soba> sobe= new ArrayList<Soba>();
	
	public Start() {
		izbornik();
	}
	
	public void izbornik() {
		
		System.out.println("*****************");
		System.out.println("1. Unos Sobe");
		System.out.println("2. Pregled soba");
		System.out.println("3. Promjena sobe");
		System.out.println("4. Brisanje sobe");
		System.out.println("t - IZLAZ");
		System.out.println("******************");
		odrediAkciju();
	}
	
	private void odrediAkciju() {
	
	
		switch(provjera()) {
		
		case "1":
			unosNoveSobe();
			break;
		case "2":
			pregledSoba();
			break;
		case "3":
			promjenaSobe();
			break;
		case "4":
			brisanjeSobe();
			break;
		case "t":
			System.out.println("Dovidenja");
			return;
			default:
				System.out.println("Ne postojeca akcija");
		}
		izbornik();
	}
	
		private String provjera() {
			String unos;
			while (true) {
				unos = JOptionPane.showInputDialog("Odaberi akciju");
				if (unos.length() > 1 || unos.trim().isEmpty() || (!unos.matches("[1-4]+") && !unos.equals("t"))) {
					JOptionPane.showMessageDialog(null, "Krivi odabir");
					continue;
				}
				return unos;

			}

		}
		
		
	

	private void unosNoveSobe() {
		Soba soba = new Soba();
		
		soba.setSifra();
		soba.setZabranjen(Pomocno.provjeraB("Zabranjen da/ne?"));
		soba.setNapravljen(Pomocno.datum());
		soba.setPosuden(Pomocno.datum());
		soba.setPostanskiBroj(Pomocno.ucitajString("Unesi postanski broj"));
		soba.setKreiran(Pomocno.datum());
		soba.setProgram(unosProgram());
		
		sobe.add(soba);
		System.out.println("Soba uspjeseno dodana!");
	}

	private Program unosProgram() {
		Program program = new Program();
		
		program.setSifra();
		program.setObrisan(Pomocno.provjeraB("Obrisan da/ne?"));
		program.setNaziv(Pomocno.ucitajString("Unesi naziv sobe"));
		program.setDatum(Pomocno.datum());
		program.setPrezime(Pomocno.ucitajString("Unesi prezime"));
		program.setMobitel(Pomocno.ucitajString("Unesi mobitel"));
		
		return program;
	}

	private void pregledSoba() {
		System.out.println("****PREGLED****");
		if (sobe.isEmpty()) {
			System.out.println("LISTA JE PRAZNA!");
		}
		
		for(Soba soba : sobe) {
			
			System.out.println(soba);
		}
		System.out.println("**************");
	}

	private void promjenaSobe() {
		pregledSoba();
		int redniBroj = Pomocno.ucitajBroj("Odaberi broj sobe");
		int index=redniBroj-1;
		
		promjenaPodatakaSobe(sobe.get(index));
	
	}

	private void promjenaPodatakaSobe(Soba soba) {
		
		
				soba.setZabranjen(Pomocno.provjeraB("Zabranjen da/ne"));
				soba.setNapravljen(Pomocno.datum());
				soba.setPosuden(Pomocno.datum());
				soba.setPostanskiBroj(Pomocno.ucitajString("Unesi postanski broj"));
				soba.setKreiran(Pomocno.datum());
				soba.setProgram(unosProgram());
				System.out.println("Promjena je uspjesna");
			
		
	}

	private void brisanjeSobe() {
		System.out.println("#### BRISANJE OSOBE ####");
		pregledSoba();
		
		int redniBroj=Pomocno.ucitajBroj("Unesite broj sobe koju zelite obrisati");
		
		int index=redniBroj-1;
		
		if(Pomocno.ucitajBroj("1 za brisati, ostalo za odustati")!=1) {
			return;
		}
		
		sobe.remove(index);
	
	}

	public static void main(String[] args) {
		new Start();
	}
}
