package metode_klase.planinarenje_51;

import java.util.ArrayList;

/*Planinar ima ime, prezime i jedinstveni celobrojni identifikacioni broj. Planinar moze da se penje
po zadatoj planini. Penjanje moze biti uspesno ili neuspesno. Moze da se sastavi tekstualni
opis planinara u obliku ime-ident.*/

public class Planinar {

	private String ime;
	private String prezime;
	private int jib;
	private static int idbroj = 1;
	public static ArrayList<Planinar> sviPlaninari = new ArrayList<Planinar>();
	
	public Planinar(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
		this.jib = idbroj;
		idbroj++;
		sviPlaninari.add(this);
	}
	
	public static int dohvatiID() {
		return idbroj;
	}
	
	public int gohvatiJIB() {
		return jib;
	}
	
	public String getIme() {
		return ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	@Override
	public String toString() {
		return ime + " " + prezime + " - " +jib;
	}
	
	public static void ispisiSve() {
		System.out.println("Planinari:");
		
		for (Planinar p : sviPlaninari) {
			System.out.println(p.jib +". " + p.toString());
				
		}
	}
	
}
