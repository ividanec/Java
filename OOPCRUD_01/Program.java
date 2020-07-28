package edunova.soba;

import java.time.LocalDate;

public class Program {

	private Integer sifra;
	private boolean obrisan;
	private String naziv;
	private LocalDate datum;
	private String prezime;
	private String mobitel;
	
	public Integer getSifra() {
		return sifra;
	}

	public void setSifra(Integer sifra) {
		this.sifra = sifra;
	}

	public boolean isObrisan() {
		return obrisan;
	}

	public void setObrisan(boolean obrisan) {
		this.obrisan = obrisan;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public LocalDate getDatum() {
		return datum;
	}

	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getMobitel() {
		return mobitel;
	}

	public void setMobitel(String mobitel) {
		this.mobitel = mobitel;
	}


	@Override
	public String toString() {

		return sifra + " "+obrisan + " "+naziv + " "+ datum.toString() + " " + prezime + " " + mobitel;
	}
}
