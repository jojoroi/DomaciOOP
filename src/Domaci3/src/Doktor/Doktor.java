package Doktor;

public abstract class Doktor {
	private String ime_prezime;
	private String ustanova;
	private int godine;
	private char pol;
	public Doktor() {};
	public Doktor(String ime_prezime) {
		this.ime_prezime = ime_prezime;
	}
	public Doktor(String ime_prezime, String ustanova) {
		this.ime_prezime = ime_prezime;
		this.ustanova = ustanova;
	}
	public Doktor(String ime_prezime, String ustanova, int godine) {
		this.ime_prezime = ime_prezime;
		this.ustanova = ustanova;
		this.godine = godine;
	}
	public Doktor(String ime_prezime, String ustanova, int godine, char pol) {
		this.ime_prezime = ime_prezime;
		this.ustanova = ustanova;
		this.godine = godine;
		this.pol = pol;
	}
	public String getIme_prezime() {
		return ime_prezime;
	}
	public void setIme_prezime(String ime_prezime) {
		this.ime_prezime = ime_prezime;
	}
	public String getUstanova() {
		return ustanova;
	}
	public void setUstanova(String ustanova) {
		this.ustanova = ustanova;
	}
	public int getGodine() {
		return godine;
	}
	public void setGodine(int godine) {
		this.godine = godine;
	}
	public char getPol() {
		return pol;
	}
	public void setPol(char pol) {
		this.pol = pol;
	}
	
}
