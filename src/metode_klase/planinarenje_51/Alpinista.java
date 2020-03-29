package metode_klase.planinarenje_51;

/*Alpinista je planinar kome moze da se dodeli drugi Alpinista kao partner i koji se penje po
planinama visim od 3000m. Partner moze da se dohvati i postavi. Nije moguce postaviti
partnera ukoliko partner vec ima dodeljenog partnera. Ukoliko alpinista nema dodeljenog
partnera ili je planina manja od 3000m, penjanje je neuspesno. Tekstualni opis je A_ime-ident.*/

public class Alpinista extends Planinar {

	private Alpinista partner;
	private boolean zauzet;
	private boolean uspesnost;
	

	public Alpinista(String ime, String prezime) {
		super(ime, prezime);
		this.zauzet = false;
		this.partner = null;
	}

	public void postaviPartnera(Alpinista a) {
		if (partner == null && a.zauzet == false) {
			partner = a;
			zauzet = true;
			a.partner = this;
			a.zauzet = true;
		}
	}
	
	public Alpinista dohvatiPartnera() {
		return partner;
	}
	
	
	
	public boolean proveriUspesnosta(Planina p) {
		if (p.getVisina() < 3000 || zauzet == false) return uspesnost = false;
		else return uspesnost = true;
	}
	
	@Override
	public String toString() {
		return "A_" + super.toString();
	}
	
	
}
