package Doktor;

public class Test {

	public static void main(String[] args) {
		Anesteziolog anesteziolog1 = new Anesteziolog(20, "Mare Kalanic", "Bolnica", 50, 'M');
		Radiolog radiolog1 = new Radiolog("MRI, CAT", "Srbo Ljubic", "Decija bolnica", 43, 'M');
		System.out.println(anesteziolog1.getIme_prezime());
		System.out.println(anesteziolog1.getUstanova());
		System.out.println(anesteziolog1.getGodine());
		System.out.println(anesteziolog1.getPol());
		System.out.println(anesteziolog1.getBroj_operacija());
		System.out.println(radiolog1.getIme_prezime());
		System.out.println(radiolog1.getUstanova());
		System.out.println(radiolog1.getGodine());
		System.out.println(radiolog1.getPol());
		System.out.println(radiolog1.getRadne_stanice());
		
	}

}
