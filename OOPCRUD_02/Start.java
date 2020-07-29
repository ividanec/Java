package edunova.student;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;



public class Start {
	
	private int studentId = 1;
	private int smjerId = 1;
	
	private List<Student> studenti =  new ArrayList<Student>();
	
	

	public Start() {
		randomGenerator();
		
		while (true) {
			
			izbornik();
			
		switch (izbor()) {
		
		case "1":
			unosStudenta();
			break;
		case "2":
			ispisStudenata();
			break;
		case "3":
			promjenaStudenta();
			break;
		case "4":
			brisanjeStudenta();
			break;
		case "r":
			izlaz();
			return;
		default:
			System.out.println("Ne postojeća akcija");	
		}
	
		}
		
	}
	
	
	
	private void izlaz() {

		System.out.println("\n");
		System.out.println("Dovidenja!");
		System.out.println("\n");
	}

	private void brisanjeStudenta() {
		System.out.println("\n***  BRISANJE STUDENTA ***");
		ispisStudenata();

		int sifra = Pomocno.ucitajBroj("Unesite šifru studenta kojeg želite obrisati");

		for (Student student : studenti) {
			if (student.getSifra().equals(sifra) && Pomocno
					.prisutan("Jeste li sigurni da želite obrisati studenta?")) {

				studenti.remove(sifra - 1);

				System.out.println("Student " + student.getSifra() + " je uspješno obrisan!");
				return;
			}
		}		
	}

	private void promjenaStudenta() {
		while (true) {

			int sifra = Pomocno.ucitajBroj("Odaberite šifru studenta koju zelite promijeniti:");

			try {

				for (Student student : studenti) {
					if (student.getSifra().equals(sifra)) {
						promjenaPodatakaStudenta(student);
						return;

					}

				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Student pod tom šifrom ne postoji");
			}

		}	
	}
	
	private void promjenaPodatakaStudenta(Student student) {
		
		student.setProdan(Pomocno.ucitajDatum("Unesite datum: (dd-MM-yyyy)"));
		student.setAdresa(Pomocno.ucitajString("Unesite adresu studenta: "));
		student.setIznos(Pomocno.unosDecimala("Unesite iznos:"));
		student.setKolicina(Pomocno.unosDecimala("Unesite kolicinu:"));
		student.setTwitter(Pomocno.ucitajString("Unesite twitter:"));
		student.setSmjer(student.getSmjer());

		System.out.println("Student je promijenjen!");
	}

	private void ispisStudenata() {
		System.out.println("#### Studenti u sustavu ####");
		
	
		for (Student student : studenti) {
			System.out.println(student);
		}
		
	}

	private void unosStudenta() {
		Student student = new Student();
		
		student.setSifra(studentId++);
		student.setProdan(Pomocno.ucitajDatum("Unesite datum: (dd-MM-yyyy)"));
		student.setAdresa(Pomocno.ucitajString("Unesite adresu studenta:"));
		student.setIznos(Pomocno.unosDecimala("Unesite iznos:"));
		student.setKolicina(Pomocno.unosDecimala("Unesite kolicinu:"));
		student.setTwitter(Pomocno.ucitajString("Unesite twitter:"));
		student.setSmjer(unosSmjer());
		
		studenti.add(student);
		System.out.println("Uspjesan unos!");
	}

	private Smjer unosSmjer() {
		Smjer smjer = new Smjer();
		
		smjer.setSifra(smjerId++);
		smjer.setBoja(Pomocno.ucitajString("Unesite boju:"));
		smjer.setMrezno_mjesto(Pomocno.ucitajString("Unesite mrezno mjesto:"));
		smjer.setTelefon(Pomocno.unesiSamoBrojeve("Unesite broj telefona:"));
		smjer.setBroj(Pomocno.ucitajBroj("Unesite broj:"));
		smjer.setPrisutan(Pomocno.prisutan("Unesite prisutan da/ne?"));
		
		return smjer;
	}

	private String izbor() {
		
		return Pomocno.izbornikAkcije("Odaberite zeljenu akciju");
	}

	private void izbornik() {
		System.out.println("1. Unesi studenta");
		System.out.println("2. Ispis studente");
		System.out.println("3. Promjeni studenta");
		System.out.println("4. Brisanje studenta");
		System.out.println("r - IZLAZ");
		
	}

	
	private void randomGenerator() {
		do {
			studenti.add(randomUnosStudenta());
			
		} while (studenti.size() < 20); 
		for (Student student : studenti) {
			System.out.println(student);
			
		}
			
	}

	private Student randomUnosStudenta() {
		Student student = new Student();
		
		student.setSifra(studentId++);
		student.setProdan(Pomocno.createRandomDate(1900, 2000));
		student.setAdresa(Pomocno.randomAdresa());
		student.setIznos(Pomocno.randomIznos());
		student.setKolicina(Pomocno.randomKolicina());
		student.setTwitter(Pomocno.randomTwitter());
		student.setSmjer(randomUnosSmjera());
		return student;
	}

	private Smjer randomUnosSmjera() {
		Smjer smjer = new Smjer();
		
		smjer.setSifra(smjerId++);
		smjer.setBoja(Pomocno.randomBoja());
		smjer.setMrezno_mjesto(Pomocno.randomMreznoMjesto());
		smjer.setTelefon(Pomocno.randomTelefon());
		smjer.setBroj(Pomocno.randomNum(1, 100));
		smjer.setPrisutan(Pomocno.randomBoolean());
		
		return smjer;
	}

	public static void main(String[] args) {
		new Start();
	}
}
