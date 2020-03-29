package metode_klase.pozoriste_47;

/*Dete ima ime, prezime, broj godina i broj klikera. Napraviti mogucnost da se kreira vise objekata klase Dete. Ako se pozove metoda dodajKlikere ili metoda oduzmiKlikere, broj klikera se azurira.
Napraviti metodu koja ce ispisivati broj klikera i metodu koja ispisuje prosecan broj decjih godina(ako imamo troje dece, broj prosecnih godina za njih troje; ako imamo dvoje racunamo prosecne godine za to dvoje)*/

public class Dete {

	private String ime;
	private String prezime;
	private double godine;
	private int klikeri; //br klikera jednog deteta
	private static int brojKlikera;
	private static double brojDece;
	private static int ukupnoGodina;
	private static double prosekGodina;
	
	public Dete(String ime, String prezime, double godine, int klikeri) {
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
		this.klikeri = klikeri;
		brojKlikera = brojKlikera + klikeri;
		brojDece++;
		ukupnoGodina += godine;
		prosekGodina = ukupnoGodina / brojDece;
	}
	
	public String dohvatiIme() {
		return ime;
	}
	
	public String dohvatiPrezime() {
		return prezime;
	}
	
	public int dohvatiKlikeri() {
		return klikeri;
	}
	
	public static int dohvatiBrojKlikera() {
		return brojKlikera;
	}
	
	public static double dohvatiProsekGodina() {
		return prosekGodina;
	}
	
	public int dodajKlikere(int broj) {
		klikeri +=broj;
		brojKlikera += broj;
		return brojKlikera;
	}
	
	public int oduzmiKlikere(int broj) {
		klikeri -=broj;
		brojKlikera -= broj;
		return brojKlikera;
	}
}
