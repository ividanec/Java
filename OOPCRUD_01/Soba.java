package edunova.soba;

import java.time.LocalDate;

public class Soba {

	private Integer sifra;
	private boolean zabranjen;
	private LocalDate napravljen;
	private LocalDate posuden;
	private String postanskiBroj;
	private LocalDate kreiran;
	private Program program;
	
	public Integer getSifra() {
		return sifra;
	}
	public void setSifra(Integer sifra) {
		this.sifra = sifra;
	}
	public boolean isZabranjen() {
		return zabranjen;
	}
	public void setZabranjen(boolean zabranjen) {
		this.zabranjen = zabranjen;
	}
	public LocalDate getNapravljen() {
		return napravljen;
	}
	public void setNapravljen(LocalDate napravljen) {
		this.napravljen = napravljen;
	}
	public LocalDate getPosuden() {
		return posuden;
	}
	public void setPosuden(LocalDate posuden) {
		this.posuden = posuden;
	}
	public String getPostanskiBroj() {
		return postanskiBroj;
	}
	public void setPostanskiBroj(String postanskiBroj) {
		this.postanskiBroj = postanskiBroj;
	}
	public LocalDate getKreiran() {
		return kreiran;
	}
	public void setKreiran(LocalDate kreiran) {
		this.kreiran = kreiran;
	}
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}
	
	@Override
	public String toString() {
		
		return sifra + " " + zabranjen + " " + napravljen.toString() + " " + posuden.toString() + " " + postanskiBroj + " " 
		+ kreiran.toString() + " " + program;
	}
}
