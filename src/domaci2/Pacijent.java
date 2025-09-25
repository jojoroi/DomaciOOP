package domaci2;

public class Pacijent {
	private String ime_prezime;
	private String ime_prezime_doktora;
	private int godine;
	private char pol;
	private String dijagnoza;
	
	public Pacijent(String ime_prezime, String ime_prezime_doktora, int godine, char pol, String dijagnoza) {
		this.ime_prezime=ime_prezime;
		this.ime_prezime_doktora=ime_prezime_doktora;
		this.godine=godine;
		this.pol=pol;
		this.dijagnoza=dijagnoza;
	}
}