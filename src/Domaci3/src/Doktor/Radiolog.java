package Doktor;

public class Radiolog extends Doktor{
	private String radne_stanice;
	public Radiolog() {};
	public Radiolog(String radne_stanice) {
		this.radne_stanice = radne_stanice;	
	}
	public Radiolog(String radne_stanice, String ime_prezime) {
		super(ime_prezime);
		this.radne_stanice = radne_stanice;	
	}
	public Radiolog(String radne_stanice, String ime_prezime, String ustanova) {
		super(ime_prezime, ustanova);
		this.radne_stanice = radne_stanice;	
	}
	public Radiolog(String radne_stanice, String ime_prezime, String ustanova, int godine) {
		super(ime_prezime, ustanova, godine);
		this.radne_stanice = radne_stanice;	
	}
	public Radiolog(String radne_stanice, String ime_prezime, String ustanova, int godine, char pol) {
		super(ime_prezime, ustanova, godine, pol);
		this.radne_stanice = radne_stanice;	
	}
	public String getRadne_stanice() {
		return radne_stanice;
	}
	public void setRadne_stanice(String radne_stanice) {
		this.radne_stanice = radne_stanice;
	}
	
}