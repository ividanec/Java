package edunova.zgrada;

import java.time.LocalDate;

public class Stranica {

	private Integer sifra;
	private String ime;
	private String twitter;
	private String postanskiBroj;
	private boolean zabranjen;
	private LocalDate prodan;
	
	public Integer getSifra() {
		return sifra;
	}
	public void setSifra(Integer sifra) {
		this.sifra = sifra;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getPostanskiBroj() {
		return postanskiBroj;
	}
	public void setPostanskiBroj(String postanskiBroj) {
		this.postanskiBroj = postanskiBroj;
	}
	public boolean isZabranjen() {
		return zabranjen;
	}
	public void setZabranjen(boolean zabranjen) {
		this.zabranjen = zabranjen;
	}
	public LocalDate getProdan() {
		return prodan;
	}
	public void setProdan(LocalDate prodan) {
		this.prodan = prodan;
	}
	
	@Override
	public String toString() {
		
		return sifra + " " + ime + " " + twitter + " " + postanskiBroj + " " + zabranjen + " " + prodan.toString();
	}
}
