package metode_klase.planinarenje_51;

import java.util.ArrayList;

/*Planina ima ime i visinu (u metrima) koji mogu da se dohvate. Moze da se sastavi tekstualni
opis planine u obliku ime(visina). Takodje planina sadrizi listu planinara. Moze da se dohvati
planinar na nekoj odredjenoj poziciji u listi, moguce je da se doda/ukloni planinar. Takodje
moguce je ispisati sve planinare na planini u obliku [ime-ident,ime-ident,ime-ident...]*/

public class Planina {

	private String ime;
	private int visina;
	private ArrayList<Planinar> planinari;

	public Planina(String ime, int visina) {
		this.ime = ime;
		this.visina = visina;
		planinari = new ArrayList<Planinar>();
	}

	public String getIme() {
		return ime;
	}

	public int getVisina() {
		return visina;
	}

	/*	METODA JE U KLASI ALPINISTA, a postoji i slicna u klasi KlasicniPlaninar
	 	public boolean proveriUspesnosta(Planina p) {
		if (p.getVisina() < 3000 || zauzet == false) return uspesnost = false;
		else return uspesnost = true;
	}*/
		
	public void dodajPlaninare(Planinar p) {
		//if(p.proveriUspesnost(Planina.this))
		planinari.add(p);

	}

	public void ukloniPlaninare(Planinar p) {
		planinari.remove(p);

	}

	public Planinar getPlaninarNaPoz(int i) {
		return planinari.get(i);
	}

	public int getBrojPlaninara() {
		return planinari.size();
	}

	/*public void ispis() {
		System.out.print("[");
		for (int i = 0; i < planinari.size(); i++) {
			System.out.print(planinari.get(i));
			if (i < planinari.size() - 1)
				System.out.print(", ");
		}
		System.out.println("]");
	}*/
	
	//for each loop
	public void ispis() {
		System.out.print("[");
		for (Planinar p : planinari)
			System.out.print(p + ", ");
		
		System.out.println("]");
	}
	
}
