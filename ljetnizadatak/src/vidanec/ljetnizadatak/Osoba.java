package vidanec.ljetnizadatak;

public class Osoba {

	private int sifra;
	private String ime;
	private String prezime;
	private String broj_tel;
	private String oib;
	
	public Osoba() {
		
	}
	
	public Osoba(int sifra, String ime, String prezime, String broj_tel, String oib) {
		super();
		this.sifra = sifra;
		this.ime = ime;
		this.prezime = prezime;
		this.broj_tel = broj_tel;
		this.oib = oib;
	}
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getBroj_tel() {
		return broj_tel;
	}
	public void setBroj_tel(String broj_tel) {
		this.broj_tel = broj_tel;
	}
	public String getOib() {
		return oib;
	}
	public void setOib(String oib) {
		this.oib = oib;
	}
	
	@Override
	public String toString() {
		
		return prezime + " " + ime;
	}
}
