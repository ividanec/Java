package edunova.soba;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class Start {
	
	private int sobaId = 1;
	private int programId = 1;
	

	List<Soba> sobe= new ArrayList<Soba>();
	
	public Start() {
		randomGenerator();
		
		while(true) {
			
			izbornik();
		
			switch(izbor()) {
			
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
			
		}
		
		
	}
	
	private void randomGenerator() {
		do {
			sobe.add(randomUnosStudenta());
			
		} while (sobe.size() < 20); 
		for (Soba soba : sobe) {
			System.out.println(soba);
			
		}
		
	}

	private Soba randomUnosStudenta() {
		Soba soba = new Soba();
		
		soba.setSifra(sobaId++);
		soba.setZabranjen(Pomocno.randomBoolean());
		soba.setNapravljen(Pomocno.createRandomDate(1900, 2000));
		soba.setPosuden(Pomocno.createRandomDate(1900, 2000));
		soba.setPostanskiBroj(Pomocno.randomPostanskiBroj());
		soba.setKreiran(Pomocno.createRandomDate(1900, 2000));
		soba.setProgram(randomUnosPrograma());
		
		return soba;
	}

	private Program randomUnosPrograma() {
		Program program = new Program();
		
		program.setSifra(programId++);
		program.setObrisan(Pomocno.randomBoolean());
		program.setNaziv(Pomocno.randomNaziv());
		program.setDatum(Pomocno.createRandomDate(1900, 2000));
		program.setPrezime(Pomocno.randomNaziv());
		program.setMobitel(Pomocno.randomMobitel());
		
		return program;
	}

	public void izbornik() {
		
		System.out.println("*****************");
		System.out.println("1. Unos Sobe");
		System.out.println("2. Pregled soba");
		System.out.println("3. Promjena sobe");
		System.out.println("4. Brisanje sobe");
		System.out.println("t - IZLAZ");
		System.out.println("******************");
	}
	
	private String izbor() {
		return Pomocno.izbornikAkcije("Odaberi akciju");
	}
	
	

	private void unosNoveSobe() {
		Soba soba = new Soba();
		
		soba.setSifra(sobaId++);
		soba.setZabranjen(Pomocno.provjera("Zabranjen da/ne?"));
		soba.setNapravljen(Pomocno.ucitajDatum("Unesite datum: (dd-MM-yyyy)"));
		soba.setPosuden(Pomocno.ucitajDatum("Unesite datum: (dd-MM-yyyy)"));
		soba.setPostanskiBroj(Pomocno.ucitajString("Unesite postanski broj"));
		soba.setKreiran(Pomocno.ucitajDatum("Unesite datum: (dd-MM-yyyy)"));
		soba.setProgram(unosProgram());
		
		sobe.add(soba);
		System.out.println("Uspjesan unos!");
	}

	private Program unosProgram() {
		Program program = new Program();
	
		program.setSifra(programId++);
		program.setObrisan(Pomocno.provjera("Obrisan da/ne?"));
		program.setNaziv(Pomocno.ucitajString("Unesite naziv"));
		program.setDatum(Pomocno.ucitajDatum("Unesite datum: (dd-MM-yyyy)"));
		program.setPrezime(Pomocno.ucitajString("Unesite prezime"));
		program.setMobitel(Pomocno.unesiSamoBrojeve("Unesi broj mobitela"));
		
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
		while(true) {
			int sifra = Pomocno.ucitajBroj("Unesite broj sobe koju zelite promijeniti");
			
			try {
				for(Soba soba : sobe) {
					if (soba.getSifra().equals(sifra)) {
						promjenaPodatakaSobe(soba);
						return;
					}
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Soba pod tom šifrom ne postoji");
			}
		}
	}

	private void promjenaPodatakaSobe(Soba soba) {
		
			soba.setSifra(sobaId++);
			soba.setZabranjen(Pomocno.provjera("Zabranjen da/ne"));
			soba.setNapravljen(Pomocno.ucitajDatum("Unesite datum: (dd-MM-yyyy)"));
			soba.setPosuden(Pomocno.ucitajDatum("Unesite datum: (dd-MM-yyyy)"));
			soba.setPostanskiBroj(Pomocno.ucitajString("Unesite postanski broj"));
			soba.setKreiran(Pomocno.ucitajDatum("Unesite datum: (dd-MM-yyyy)"));
			soba.setProgram(unosProgram());
			System.out.println("Promjena je uspjesna");
			
		
	}

	private void brisanjeSobe() {
		System.out.println("#### BRISANJE OSOBE ####");
		pregledSoba();
		
		int sifra = Pomocno.ucitajBroj("Unesite broj sobe koju zelite obrisati");
	
		for (Soba soba : sobe) {
			if (soba.getSifra().equals(sifra) && Pomocno
					.provjera("Jeste li sigurni da želite obrisati sobu?" +"\n"+" da/ne")) {

				sobe.remove(sifra - 1);

				System.out.println("Soba je uspješno obrisana!");
				return;
			}
		}		
	}

	public static void main(String[] args) {
		new Start();
	}
}
