package metode_klase.jelovnik_52;

/* Torta 	je jelo za koje se mo�e do�i do informacije o tome da li sadr�ii margarin ili ne.
Dodatni zahtev: mo�e se do�i i do informacije o tome koliko procenata �e�era postoji u odnosu na celu tortu.*/

public class Torta extends Jelo {

	private boolean imaMargarin;
	private double procenatSecera;

	public Torta(String naziv) {
		super(naziv);
		
	}

	public boolean proveriMargarin() {

		for (int i = 0; i < getSastojci().size(); i++) {
			if (getSastojci().get(i).getNaziv().toLowerCase().equals("margarin"))
				return imaMargarin = true;
		}
		return imaMargarin = false;
	}

	public double izracunajSecer() {

		double masaTorte = 0;
		int kolicinaSecera = 0;

		for (int i = 0; i < getKolicinaSast().size(); i++) {
			masaTorte += getKolicinaSast().get(i);
			if (getSastojci().get(i).getNaziv().toLowerCase().equals("secer"))
				kolicinaSecera = getKolicinaSast().get(i);
		}

		double procenatSecera = kolicinaSecera / masaTorte * 100;

		return procenatSecera;
	}
	
}
