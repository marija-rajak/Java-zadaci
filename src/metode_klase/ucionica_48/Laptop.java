package metode_klase.ucionica_48;

import java.util.ArrayList;

public class Laptop {

	private String marka;

	public ArrayList<Polaznik> korisnici;

	public Laptop(String marka) {
		this.marka = marka;
		korisnici = new ArrayList<Polaznik>();
	}

	public String getMarka() {
		return marka;
	}

	public void dodajPolaznika(Polaznik p) {
		korisnici.add(p);
	}

	public void ukloniPolaznika(Polaznik p) {
		korisnici.remove(p);
	}

	public String ispis() {
		return getMarka().toUpperCase() + korisnici.toString();
	}

}
