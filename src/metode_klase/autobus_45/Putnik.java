package metode_klase.autobus_45;

//Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. Odredjena svota novca moze da mu se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.

public class Putnik extends Covek {

	private float novac;

	public Putnik(String ime, String prezime, float novac) {
		super(ime, prezime);
		this.novac = novac;
	}

	public float dohvatiNovac() {
		return novac;
	}

	public boolean dodajNovac(float iznos) {
		if (iznos > 0) {
			novac += iznos;
			System.out.println("Uspesno ste dodali novac.");
			return true;
		} else {
			System.out.println("Iznos mora biti pozitivan, pokusajte ponovo.");
			return false;
		}
	}

	public boolean naplati(float cena) {
		if (cena < novac) {
			novac -= cena;
			System.out.println("Karta je naplacena");
			return true;
		} else
			System.out.println("Nemate dovoljno novca");
		return false;
	}

	@Override
	public String toString() {
		return dohvatiIme() + " " + dohvatiPrezime() + "[" + dohvatiNovac() + "]";
	}
}
