package metode_klase.autobus_45;

public class Karta {

	private float cena;
	private String naziv;
	
	public Karta(String naziv, float cena) {
		this.naziv = naziv;
		this.cena = cena;
	}
	
	public String dohvatiNazivKarte() {
		return naziv;
	}
	
	public float dohvatiCenuKarte() {
		return cena;
	}
}
