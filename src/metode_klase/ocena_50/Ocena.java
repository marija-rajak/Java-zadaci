package metode_klase.ocena_50;

/*Napraviti klasu Ocena. Potrebno je da sadrzi broj poena koje je neko imao na ispitu i metodu koja vraca koja ocena je u pitanju. 
Sadrzi naziv predmeta, i rok u kom je odrzan. 

Klasa ocena treba da ima i metodu kojoj se prosledjuje niz ocena koja racuna i vraca prosek.
Prethodnu klasu testirati. */

public class Ocena {

	private int ocena;
	private int brojPoena;
	private String predmet;
	private String rok;
	public static int rbr=0;
	private static double zbir=0;
	
	public Ocena(int ocena, int brojPoena, String predmet, String rok) {
		this.ocena = ocena;
		this.brojPoena = brojPoena;
		this.predmet = predmet;
		this.rok = rok;
		rbr++;
		zbir += ocena;
	}
	
	public static double getProsek() {
		return zbir/rbr;
	}
	
}
