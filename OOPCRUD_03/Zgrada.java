package edunova.zgrada;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Zgrada {

	private Integer sifra;
	private BigDecimal opseg;
	private String opis;
	private boolean dopusten;
	private boolean prisutan;
	private LocalDate datum;
	private Stranica stranica;
	
	public Integer getSifra() {
		return sifra;
	}
	public void setSifra(Integer sifra) {
		this.sifra = sifra;
	}
	public BigDecimal getOpseg() {
		return opseg;
	}
	public void setOpseg(BigDecimal opseg) {
		this.opseg = opseg;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public boolean isDopusten() {
		return dopusten;
	}
	public void setDopusten(boolean dopusten) {
		this.dopusten = dopusten;
	}
	public boolean isPrisutan() {
		return prisutan;
	}
	public void setPrisutan(boolean prisutan) {
		this.prisutan = prisutan;
	}
	public LocalDate getDatum() {
		return datum;
	}
	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}
	public Stranica getStranica() {
		return stranica;
	}
	public void setStranica(Stranica stranica) {
		this.stranica = stranica;
	}
	
	@Override
	public String toString() {
		
		return sifra + " " + opseg + " " + opis + " " + dopusten + " " + prisutan + " " + datum.toString() + " " + stranica;
	}
}
