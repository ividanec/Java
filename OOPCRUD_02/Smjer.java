package edunova.student;

public class Smjer {
	
	private int sifra;
	private String boja;
	private String mrezno_mjesto;
	private String telefon;
	private int broj;
	private boolean prisutan;
	
	
	public Smjer() {
		
	}
	
	public Smjer(int sifra, String boja, String mrezno_mjesto, String telefon, int broj, boolean prisutan) {
		super();
		this.sifra = sifra;
		this.boja = boja;
		this.mrezno_mjesto = mrezno_mjesto;
		this.telefon = telefon;
		this.broj = broj;
		this.prisutan = prisutan;
	}
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
	public String getMrezno_mjesto() {
		return mrezno_mjesto;
	}
	public void setMrezno_mjesto(String mrezno_mjesto) {
		this.mrezno_mjesto = mrezno_mjesto;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public int getBroj() {
		return broj;
	}
	public void setBroj(int broj) {
		this.broj = broj;
	}
	public boolean isPrisutan() {
		return prisutan;
	}
	public void setPrisutan(boolean prisutan) {
		this.prisutan = prisutan;
	}
	
	
	@Override
	public String toString() {
		
		return sifra + " " + boja + " " + mrezno_mjesto + " " + telefon + " " + broj + " " + prisutan;
	}
}
