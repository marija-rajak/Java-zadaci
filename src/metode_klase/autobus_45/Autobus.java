package metode_klase.autobus_45;

/*Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime voze. Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i vozaca. Moguce je naplatiti kartu putnicima samo ako je vozac prisutan. 
Autobus ispisati u sledecem obliku: Naziv ( vozac - Putnik1[novac], Putnik2 [novac],... )*/

import java.util.ArrayList;

public class Autobus {

	private String naziv;
	private Vozac vozac;
	private int brojMesta;
	private ArrayList<Putnik> putnici;
	private Karta karta;

	public Autobus(String naziv, Karta karta, int brojMesta) {
		this.naziv = naziv;
		this.karta = karta;
		this.brojMesta = brojMesta;
		putnici = new ArrayList<Putnik>();
	}

	public boolean dodajVozaca(Vozac vozac) {
		this.vozac = vozac;
		return true;
	}

	public boolean ukloniVozaca() {
		vozac = null;
		return true;
	}

	public boolean dodajPutnika(Putnik p) {
		if (putnici.size() >= brojMesta) {
			System.out.println("Nema vise mesta u autobusu");
			return false;
		} else if (vozac != null) {
			if (p.naplati(karta.dohvatiCenuKarte())) {
				putnici.add(p);
				System.out.println("Putnik je smesten u autobus.");
				return true;
			} else
				return false;
		} else
			System.out.println("Dodaj vozaca");
		return false;
	}

	public int ukloniPutnika(Putnik p) {
		putnici.remove(p);
		p.dodajNovac(karta.dohvatiCenuKarte());
		int brojSlobodnih = brojMesta - putnici.size();
		return brojSlobodnih;

	}

	@Override
	public String toString() {
		// return naziv + " (" + vozac + "-" + putnici + ")";
		StringBuilder sb = new StringBuilder();
		sb.append(naziv).append(" (");
		sb.append(vozac).append("; ");
		for (int i = 0; i < putnici.size(); i++) {
			sb.append("Putnik " + (i+1) + ": ").append(putnici.get(i));
			if (i < putnici.size()-1) {
				sb.append(", ");
			}
		}
		sb.append(')');
		return sb.toString();
	}

}
