package edunova.soba;

import java.text.SimpleDateFormat;

public class Program {

	private Integer sifra;
	private boolean obrisan;
	private String naziv;
	private SimpleDateFormat datum;
	private String prezime;
	private Long mobitel;
	
	
	
	public Program() {
		
	}
	
	public Program(Integer sifra, boolean obrisan, String naziv, SimpleDateFormat datum, String prezime, Long mobitel) {
		
		this.sifra = sifra;
		this.obrisan = obrisan;
		this.naziv = naziv;
		this.datum = datum;
		this.prezime = prezime;
		this.mobitel = mobitel;
	}
	
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
	public SimpleDateFormat getDatum() {
		return datum;
	}
	public void setDatum(SimpleDateFormat datum) {
		this.datum = datum;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public Long getMobitel() {
		return mobitel;
	}
	public void setMobitel(Long mobitel) {
		this.mobitel = mobitel;
	}
	
	
}
