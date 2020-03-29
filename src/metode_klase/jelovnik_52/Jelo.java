package metode_klase.jelovnik_52;

/*Jelo sadrži svoj naziv proizvoljno mnogo sastojaka, a za svaki sastojak treba znati i koliko grama je potrebno. 
Pri kreiranju se zadaje samo naziv jela.
Treba napraviti metodu koja æe omoguæiti dodavanje sastojka koja izgleda ovako:
public void dodajSastojak(Sastojak s, int kolicina);
Lista sastojaka može da se dohvati, kao i naziv.
U klasi jelo postoji metoda koja raèuna koliko novca je potrebno da bi se sve namirnice nabavile.*/

import java.util.ArrayList;

public class Jelo {

	private String nazivJela;
	private ArrayList<Sastojak> sastojci;
	private ArrayList<Integer> kolicinaSast;

	public Jelo(String nazivJela) {
		this.nazivJela = nazivJela;
		sastojci = new ArrayList<Sastojak>();
		kolicinaSast = new ArrayList<Integer>();
	}

	public String getNaziv() {
		return nazivJela;
	}

	public void dodajSastojak(Sastojak s, int kolicina) {
		this.sastojci.add(s);
		this.kolicinaSast.add(kolicina);

	}

	public ArrayList<Sastojak> getSastojci() {
		return sastojci;
	}

	public ArrayList<Integer> getKolicinaSast() {
		return kolicinaSast;
	}

	public double izracunajCenu() {
		double cena = 0;
		for (int i = 0; i < sastojci.size(); i++) {
			cena += sastojci.get(i).getCenakg() * kolicinaSast.get(i) / 1000;
		}
		return cena;
	}
}
