package vidanec.ljetnizadatak;

public class Start {

	public Start() {
		izbornik();
		Baza.zatvoriVezu();
	}
	
	private void izbornik() {
		System.out.println("1. Izlistaj sve osobe iz baze");
		System.out.println("5. Izlaz iz aplikacije");
		izvedi();
	}

	private void izvedi() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new Start();
	}
}
