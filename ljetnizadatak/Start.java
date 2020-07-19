package vidanec.ljetnizadatak;

import java.util.List;

public class Start {

	public Start() {
		izbornik();
		Baza.zatvoriVezu();
	}
	
	private void izbornik() {
		System.out.println("1. Izlistaj sve osobe iz baze");
		System.out.println("2. Unesi novu osobu");
		System.out.println("5. Izlaz iz aplikacije");
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
		default:
			break;
		}
		
	}

	private void unosNoveOsobe() {
		CRUDOsoba.create(new Osoba(1,
				Pomocno.ucitajString("Unesi ime osobe"),
				Pomocno.ucitajString("Unesi prezime osobe"),
				Pomocno.ucitajString("Unesi broj telefona osobe"),
				Pomocno.ucitajString("Unesi oib osobe")));
			
	}

	private void izlistajOsobe() {
		List<Osoba> osobe = CRUDOsoba.read();
		
		
		for(int i=0;i<osobe.size();i++) {
			System.out.println(osobe.get(i));
		}
		
	}

	public static void main(String[] args) {
		new Start();
	}
}
