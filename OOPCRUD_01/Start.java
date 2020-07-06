package edunova.soba;

public class Start {

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
		int akcija=Pomocno.ucitajBroj("Odaberi akciju");
		
		switch(akcija) {
		case 1:
			unosNoveSobe();
			break;
		case 2:
			pregledSoba();
			break;
		case 3:
			promjenaSobe();
			break;
		case 4:
			brisanjeSobe();
			break;
		case 5:
			System.out.println("Dovidenja");
			return;
		default :
			System.out.println("Ne postojeca akcija");	
		}
		izbornik();
	}

	private void unosNoveSobe() {
		// TODO Auto-generated method stub
		
	}

	private void pregledSoba() {
		// TODO Auto-generated method stub
		
	}

	private void promjenaSobe() {
		// TODO Auto-generated method stub
		
	}

	private void brisanjeSobe() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new Start();
	}
}
