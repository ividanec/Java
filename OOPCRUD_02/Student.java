package edunova.student;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Student {

	private Integer sifra;
	private LocalDate prodan;
	private String adresa;
	private BigDecimal iznos;
	private BigDecimal kolicina;
	private String twitter;
	private Smjer smjer;
	
	
	
	public Integer getSifra() {
		return sifra;
	}
	public void setSifra(Integer sifra) {
		this.sifra = sifra;
	}
	public LocalDate getProdan() {
		return prodan;
	}
	public void setProdan(LocalDate prodan) {
		this.prodan = prodan;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public BigDecimal getIznos() {
		return iznos;
	}
	public void setIznos(BigDecimal iznos) {
		this.iznos = iznos;
	}
	public BigDecimal getKolicina() {
		return kolicina;
	}
	public void setKolicina(BigDecimal kolicina) {
		this.kolicina = kolicina;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public Smjer getSmjer() {
		return smjer;
	}
	public void setSmjer(Smjer smjer) {
		this.smjer = smjer;
	}
	
	@Override
	public String toString() {
		
		return sifra + " " + prodan.toString() + "  " + adresa + "  " + iznos + "  " + kolicina + "  " + twitter + "  " + smjer.toString();
	}
	
}
