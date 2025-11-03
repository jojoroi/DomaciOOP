package Doktor;

public class Anesteziolog extends Doktor{
	private int broj_operacija;
	public Anesteziolog() {};
	public Anesteziolog(int broj_operacija) {
		this.broj_operacija = broj_operacija;
	}
	public Anesteziolog(int broj_operacija, String ime_prezime) {
		super(ime_prezime);
		this.broj_operacija = broj_operacija;
	}
	public Anesteziolog(int broj_operacija, String ime_prezime, String ustanova) {
		super(ime_prezime, ustanova);
		this.broj_operacija = broj_operacija;
	}
	public Anesteziolog(int broj_operacija, String ime_prezime, String ustanova, int godine) {
		super(ime_prezime, ustanova, godine);
		this.broj_operacija = broj_operacija;
	}
	public Anesteziolog(int broj_operacija, String ime_prezime, String ustanova, int godine, char pol) {
		super(ime_prezime, ustanova, godine, pol);
		this.broj_operacija = broj_operacija;
	}
	public int getBroj_operacija() {
		return broj_operacija;
	}
	public void setBroj_operacija(int broj_operacija) {
		this.broj_operacija = broj_operacija;
	}
	
}