package metode_klase.autobus_45;

//Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).

public class Vozac extends Covek {

	private String zanimanje;
	
	public Vozac(String ime, String prezime) {
		super(ime, prezime);
		this.zanimanje = "sofer";
	}
	
@Override
public String toString() {
	return "Vozac: " + dohvatiIme() + " " + dohvatiPrezime();
}
}
