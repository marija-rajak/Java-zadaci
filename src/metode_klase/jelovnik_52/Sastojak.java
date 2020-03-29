package metode_klase.jelovnik_52;

//Sastojak sadri naziv i cenu po kilogramu. Svi podaci mogu da se dohvate. Omoguæiti da cena moe i da se promeni, ali da nikada neæe biti negativna.


public class Sastojak {

	private String naziv;
	private double cenakg;
	
	public Sastojak(String naziv, double cenakg) {
		this.naziv = naziv;
		if (cenakg> 0) this.cenakg = cenakg;
	}
	
	public String getNaziv() {
		return naziv;
	}
	
	public double getCenakg() {
		return cenakg;
	}
	
	public boolean promeniCenu(double novaCena) {
		if (novaCena > 0) {
		cenakg = novaCena;
		return true;
		}
		return false;
	}
	
}
