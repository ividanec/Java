package edunova.soba;

import java.text.SimpleDateFormat;

public class Soba {

	private Integer sifra;
	private boolean zabranjen;
	private SimpleDateFormat napravljen;
	private SimpleDateFormat posuden;
	private Long postanskiBroj;
	private SimpleDateFormat kreiran;
	private Program program;
	
	
	
	
	public Soba() {
		
	}
	
	public Soba(Integer sifra, boolean zabranjen, SimpleDateFormat napravljen, SimpleDateFormat posuden,
			Long postanskiBroj, SimpleDateFormat kreiran, Program program) {
		
		this.sifra = sifra;
		this.zabranjen = zabranjen;
		this.napravljen = napravljen;
		this.posuden = posuden;
		this.postanskiBroj = postanskiBroj;
		this.kreiran = kreiran;
		this.program = program;
	}
	
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
	public SimpleDateFormat getNapravljen() {
		return napravljen;
	}
	public void setNapravljen(SimpleDateFormat napravljen) {
		this.napravljen = napravljen;
	}
	public SimpleDateFormat getPosuden() {
		return posuden;
	}
	public void setPosuden(SimpleDateFormat posuden) {
		this.posuden = posuden;
	}
	public Long getPostanskiBroj() {
		return postanskiBroj;
	}
	public void setPostanskiBroj(Long postanskiBroj) {
		this.postanskiBroj = postanskiBroj;
	}
	public SimpleDateFormat getKreiran() {
		return kreiran;
	}
	public void setKreiran(SimpleDateFormat kreiran) {
		this.kreiran = kreiran;
	}
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}
	
	
}
